import Vue from 'vue'
import App from './App.vue'
import ShoppingList from './components/ShoppingList.vue'

Vue.config.productionTip = false

new Vue({
  render: h => h(App),
}).$mount('#app')

export default{
methods:{
  changeStatus(id) {
    const arrIndex = this.groceries.findIndex((item) => item.id == id);
    this.groceries[arrIndex].completed = !this.groceries[arrIndex].completed;

  }
}
}
