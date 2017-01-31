<template>

 <div class="row">
             <div class="col-lg-12 text-center">
                 <div class="helloServer">
                  <p style="color:red">{{ username }}</p>
                  <p style="color:blue">{{ someStaticData }}</p>

                  <!--
                  <alert :show.sync="showTop" placement="top" duration="3000" type="danger" width="400px" dismissable>
                    <span class="icon-info-circled alert-icon-float-left"></span>
                    <strong>Heads up!</strong>
                    <p>This alert needs your attention.</p>
                  </alert>
                  -->
                 </div>
             </div>
  </div>


</template>

<script>

import Vue from 'vue'
import VueResource from 'vue-resource'
import { alert } from 'vue-strap'

Vue.use(VueResource)


export default {
  name: 'helloServer',
  data () {
   return {
     username: this.fetchData(),
     someStaticData: 'This is some static data'
   }
  },
  methods:{
    fetchData : function () {
      var vm = this
      this.$http.get('/api/user').then(function(response){
        vm.username = response.body.username
       }, function(response){ //error
        console.log(response.status)
      })
    }
   },
   components: {
    alert
   }
}

</script>
