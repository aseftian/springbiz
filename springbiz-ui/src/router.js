import Vue from 'vue'
import Router from 'vue-router'
import Login from './views/Login.vue'
// import Home from './views/Home.vue'
import Default from './views/Default.vue'
// import Dashboard from './views/Dashboard.vue'

Vue.use(Router)

export default new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [{
      path: '/',
      component: Default,
      children: [{
          path: '',
          name: 'dashboard',
          component: () => import('./views/Dashboard.vue')
        },
        {
          path: 'admin',
          children: [{
            path: 'users',
            name: 'users',
            component: () => import('./views/admins/User.vue')
          }]
        },
      ]
    },
    {
      path: '/login',
      name: 'login',
      component: Login
    },
    {
      path: '/about',
      name: 'about',
      // route level code-splitting
      // this generates a separate chunk (about.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () => import( /* webpackChunkName: "about" */ './views/About.vue')
    }
  ]
})
