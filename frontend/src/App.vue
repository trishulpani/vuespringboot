<template>
  <div id="app">
  <!-- <hello-server></hello-server> -->
   <forum-topics></forum-topics>
  </div>
</template>

<script>

import ForumTopics from './components/ForumTopics'
import HelloServer from './components/HelloServer'

import jQuery from 'jquery'
global.jQuery = jQuery
var Bootstrap = require('bootstrap')
import 'bootstrap/dist/css/bootstrap.css'

export default {
  name: 'app',
  components: {
     ForumTopics,
     HelloServer
  }
}
</script>


