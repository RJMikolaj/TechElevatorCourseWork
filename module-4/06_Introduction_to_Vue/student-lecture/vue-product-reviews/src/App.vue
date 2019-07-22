<template>
  <div id="app">
    <img alt="Vue logo" src="./assets/logo.png">
    <HelloWorld msg="Welcome to Your Vue.js App"/>
  </div>
</template>

<script>
import HelloWorld from './components/HelloWorld.vue'

export default {
  name: 'app',
  components: {
    HelloWorld
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>

// <template>
//   <div id="app">
//     <product-review></product-review>
//     <header>Header</header>
//     <aside class="sidebar-left">Left Sidebar</aside>
//     <article>Article</article>
//     <aside class="sidebar-right">Right Sidebar</aside>
//     <footer>Footer</footer>
//   </div>
// </template>

// <script>
// import HelloWorld from "./components/HelloWorld.vue";
// import ProductReview from "./components/ProductReview.vue";

// export default {
//   name: "app",
//   components: {
//     HelloWorld,
//     ProductReview
//   }
// };
// </script>

// <style>
// body {
//   margin: 0px;
//   padding: 0px;
// }
// #app {
//   display: grid;
//   grid-template-columns: 150px auto 150px;
//   grid-template-rows: 60px 1fr 100px;
//   grid-gap: 1em;
//   height: 100vh;
// }

// header,
// aside,
// article,
// footer {
//   background: #eaeaea;
//   padding: 1em;
//   color: #949494;
// }

// header,
// footer {
//   grid-column: 1 / 4;
// }
// </style>
