import Vue from 'vue'
import App from './App.vue'

Vue.config.productionTip = false

new Vue({
  render: h => h(App),
}).$mount('#app')

export default{
methods: {
  changeStatus(id) {
      const arrIndex = this.todos.findIndex((todo) => todo.id == id);
      this.todos[arrIndex].completed = !this.todos[arrIndex].completed;
  }
}
}
