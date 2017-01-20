<template>
  <div id="app">
   <hello-server><hello-server>
  </div>
</template>

<script>

import HelloServer from './components/HelloServer'
import jQuery from 'jquery'
global.jQuery = jQuery
var Bootstrap = require('bootstrap')
import 'bootstrap/dist/css/bootstrap.css'

export default {
  name: 'app',
  components: {
   HelloServer
  }
}
</script>


