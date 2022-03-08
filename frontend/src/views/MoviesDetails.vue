<template>
 <!-- <nav>
    <router-link to="/">Home</router-link> |
    <router-link to="/movies_Details">About</router-link> |
    <router-link to="/movies">movies</router-link>
  </nav> -->
  <router-view/>
  <helloWorld />
  <BookTicket />
  
  <!-- <caRousel :slides="slides" :interval="3000" controls indicators></caRousel> -->
  <Slider />
</template>

<script>
import HelloWorld from './../components/HelloWorld.vue'
import BookTicket from './../components/BookTicket.vue'
// import CaRousel from './../components/carousel/CarouselName.vue'
export default {
  name: 'App',
  components: {
    HelloWorld, BookTicket
    
  },  
};


</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
 margin-top:0px !important;
}
.carousel-inner{
    position: relative;
    width: 1400px;
    height: 318px !important;
    overflow: hidden;
}
</style>
