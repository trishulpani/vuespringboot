<template>
 <div class="row-fluid">
   <div class="forumTopics">
      <div class="span9">
        <div id="listStuff" style="height:90%;">
          <div class="row-fluid">
            <div class="span12">
              <a href="/topics/1" title="Forum posts template with bootstrap 3.2">Sample post 1 {{counter}}</a>
            </div>
          </div>
        </div>
      </div>
    </div>
   </div>
</template>

<script>

export default {
  name: 'forumTopics',
  data: function () {
      return {
         counter: 0
      }
   }
}

</script>
