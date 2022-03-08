<template>
 <nav>
    <router-link to="/">Home</router-link> |
    <router-link to="/movies_Details">About</router-link> |
    <router-link to="/movies">movies</router-link>
  </nav>
  <router-view/>
  <HelloWorld />
  
  <caRousel :slides="slides" :interval="3000" controls indicators></caRousel>
  <Slider />
</template>

<script>
import HelloWorld from './../components/HelloWorld.vue'
import Slider from './../components/Slider.vue'
import CaRousel from './../components/carousel/CarouselName.vue'
export default {
  name: 'App',
  components: {
    HelloWorld, CaRousel, Slider
    
  },
  data: () => ({
    slides: [
      "https://assets-in.bmscdn.com/promotions/cms/creatives/1646035476610_sahweb.jpg",
      "https://assets-in.bmscdn.com/promotions/cms/creatives/1645445632606_restaurant.jpg",
      "https://assets-in.bmscdn.com/promotions/cms/creatives/1646307007376_martyrweb.jpg",
      "https://assets-in.bmscdn.com/promotions/cms/creatives/1646301945227_kultekweb.jpg",
      "https://assets-in.bmscdn.com/promotions/cms/creatives/1643608159306_fb.jpg",
    ],
  }),
  
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
