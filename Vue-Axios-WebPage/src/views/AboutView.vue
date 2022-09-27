<template>
  <div class="about">
    <h1>This is an about page</h1>
  </div>
  <button id="btn" ref="button" @click="change">{{ state }}</button>
  <div>内容应该显示在下面</div>
  <p v-text="text"></p>
</template>

<script setup>

import {ref} from "vue";

const text = ref('');
const state = ref('未点击');
const axios = require('axios').default;
const content = document.getElementById('p');

function change() {

  //其使用fetch也能发请求，但是axios更直观一点。
  axios.get('/submit', {
    baseURL: 'http://localhost:8801',
    headers: {'head': 'newhead'},
    params: {
      name: '小明'
    }
  })
      .then(function (response) {
        console.log(response);
        text.value = response.data;
        state.value = '已点击';

      })
      .catch(function (error) {
        console.log(error);
        state.value = '点了，但完全没点'
      })
      .then(function () {
        console.log('Axios请求结束');
      })
}


</script>
