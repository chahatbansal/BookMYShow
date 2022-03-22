<template>

<div>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">bookmyshow</a>
            <!--<button  class="btn" style="margin-right:20px" > <span data-toggle="modal" data-target="#cityModal">SLl</span>Click</button>
             Button trigger modal -->
            <button type="button" style="margin-right:20px" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
            {{selectedCity}}
            </button>

            <!-- Modal -->
            <div class="modal fade" id="exampleModal"  role="dialog" aria-hidden="true">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                    <div class="modal-body">
                            <!-- City List-->
                            <div class="table-responsive">
                                <table class="table cursor">
                                    <tbody>
                                        <tr>
                                            <td v-for="city in cities" :key="city.id"><a href="" v-on:click.prevent="getMovies(city.name)" >{{city.name}}</a></td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                            
                        </div>
                    </div>
                </div>
            </div>

        </div>
    </nav>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container-fluid">
            <a class="navbar-brand" href="#" >Movies</a>
        </div>
    </nav>
</div>

<div id="carouselExampleInterval" class="carousel slide card-margin" data-bs-ride="carousel">
    <div class="carousel-inner">
        <div class="carousel-item active" data-bs-interval="100">
            <img src="../assets/slide2.jpg" class="d-block w-100" height="300" alt="...">
        </div>
        <div class="carousel-item" data-bs-interval="2000">
            <img src="../assets/slide3.jpg" class="d-block w-100" height="300" alt="...">
        </div>
        <div class="carousel-item">
            <img src="../assets/slide3.jpg" class="d-block w-100" height="300" alt="...">
        </div>
    </div>
    <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleInterval" data-bs-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Previous</span>
    </button>
    <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleInterval" data-bs-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Next</span>
    </button>
</div>

<div class="card card-margin" >
  <div class="card-body">
    <h3>Recomended Movies</h3>
    <div class="table-responsive">
        <table class="table cursor">
            <tbody>
                <tr>
                    <td v-for="movie in movies" :key="movie.id">
                        <a href="">
                        <div class="card" style="width: 18rem;">
                            <router-link v-bind:to="'/movie/' + selectedCity + '/' + movie.name">
                            <img class="card-img-top" v-bind:src="require('../assets/' + movie.imageName)" alt="Card image cap">
                            </router-link>
                            <div class="card-body">
                                <p class="card-text">{{movie.name}}</p>
                            </div>
                        </div>
                        </a>
                    </td>
                </tr>
            </tbody>
        </table>
    </div>
  </div>
</div>
<div><div class="sc-133848s-4 kRasMp"><div class="sc-133848s-3 sc-133848s-5 gqBECX"><div class="sc-133848s-3 sc-133848s-10 hSMUVB" style="padding: 32px 0px 64px;"><div class="sc-133848s-3 cWbeuJ" style="margin: 0px 0px 8px; padding: 0px;"><div class="sc-133848s-2 sc-291x3n-0 lmknRz"><div class="sc-133848s-2 sc-291x3n-1 eQCApE"><div class="sc-7o7nez-0 kdBsqY">The Best of Entertainment</div></div></div></div><div class="sc-lnhrs7-0 bKwTw"><div class="sc-lnhrs7-1 iVNURo"><div class="sc-lnhrs7-2 dLGdDF"><div><a href="https://in.bookmyshow.com/explore/workshops-national-capital-region-ncr?referrerBase=" class="sc-133848s-11 sc-lnhrs7-3 bGSYo"><div class="sc-dv5ht7-0 eQcIov"><div class="sc-133848s-2 sc-5afure-0 bgaHZL"></div><div width="100%" height="100%" data-content="" class="sc-133848s-2 sc-1t5vwh0-0 dZlGtG"><div class="sc-133848s-2 sc-1t5vwh0-1 TsmVt"><div height="100%" width="100%" class="sc-eykeme-0 XxsAZ" style="background: none;"><div class="sc-eykeme-2 ixCZoP" style="opacity: 0;"><svg width="80" height="80"><use xlink:href="/chunks/icons/common-icons-355a22d8.svg#icon-bms-gray"></use></svg></div><img alt="" width="100%" height="100%" class="sc-eykeme-1 jbzDld" style="border-radius: 0px; opacity: 1; transition: all 0.5s ease 0s; width: 100%; min-height: inherit; max-height: inherit;" src="https://assets-in.bmscdn.com/discovery-catalog/collections/tr:w-800,h-800:ote-MTE1KyBFdmVudHM%3D,otc-FFFFFF,otf-Roboto,ots-64,ox-48,oy-320,ott-b:w-300:q-80/workshops-collection-202007231330.png"></div></div></div><div class="sc-133848s-3 cWbeuJ"></div></div></a></div><div><a href="https://in.bookmyshow.com/explore/health-and-fitness-national-capital-region-ncr?referrerBase=" class="sc-133848s-11 sc-lnhrs7-3 bGSYo"><div class="sc-dv5ht7-0 eQcIov"><div class="sc-133848s-2 sc-5afure-0 bgaHZL"></div><div width="100%" height="100%" data-content="" class="sc-133848s-2 sc-1t5vwh0-0 dZlGtG"><div class="sc-133848s-2 sc-1t5vwh0-1 TsmVt"><div height="100%" width="100%" class="sc-eykeme-0 XxsAZ" style="background: none;"><div class="sc-eykeme-2 ixCZoP" style="opacity: 0;"><svg width="80" height="80"><use xlink:href="/chunks/icons/common-icons-355a22d8.svg#icon-bms-gray"></use></svg></div><img alt="" width="100%" height="100%" class="sc-eykeme-1 jbzDld" style="border-radius: 0px; opacity: 1; transition: all 0.5s ease 0s; width: 100%; min-height: inherit; max-height: inherit;" src="https://assets-in.bmscdn.com/discovery-catalog/collections/tr:w-800,h-800:ote-OCBFdmVudHM%3D,otc-FFFFFF,otf-Roboto,ots-64,ox-48,oy-320,ott-b:w-300:q-80/fitness-collection-2020081150.png"></div></div></div><div class="sc-133848s-3 cWbeuJ"></div></div></a></div><div><a href="https://in.bookmyshow.com/explore/kids-national-capital-region-ncr?referrerBase=" class="sc-133848s-11 sc-lnhrs7-3 bGSYo"><div class="sc-dv5ht7-0 eQcIov"><div class="sc-133848s-2 sc-5afure-0 bgaHZL"></div><div width="100%" height="100%" data-content="" class="sc-133848s-2 sc-1t5vwh0-0 dZlGtG"><div class="sc-133848s-2 sc-1t5vwh0-1 TsmVt"><div height="100%" width="100%" class="sc-eykeme-0 XxsAZ" style="background: none;"><div class="sc-eykeme-2 ixCZoP" style="opacity: 0;"><svg width="80" height="80"><use xlink:href="/chunks/icons/common-icons-355a22d8.svg#icon-bms-gray"></use></svg></div><img alt="" width="100%" height="100%" class="sc-eykeme-1 jbzDld" style="border-radius: 0px; opacity: 1; transition: all 0.5s ease 0s; width: 100%; min-height: inherit; max-height: inherit;" src="https://assets-in.bmscdn.com/discovery-catalog/collections/tr:w-800,h-800:ote-MTArIEV2ZW50cw%3D%3D,otc-FFFFFF,otf-Roboto,ots-64,ox-48,oy-320,ott-b:w-300:q-80/kids-collection-202007220710.png"></div></div></div><div class="sc-133848s-3 cWbeuJ"></div></div></a></div><div><a href="https://in.bookmyshow.com/explore/comedy-shows-national-capital-region-ncr?referrerBase=" class="sc-133848s-11 sc-lnhrs7-3 bGSYo"><div class="sc-dv5ht7-0 eQcIov"><div class="sc-133848s-2 sc-5afure-0 bgaHZL"></div><div width="100%" height="100%" data-content="" class="sc-133848s-2 sc-1t5vwh0-0 dZlGtG"><div class="sc-133848s-2 sc-1t5vwh0-1 TsmVt"><div height="100%" width="100%" class="sc-eykeme-0 XxsAZ" style="background: none;"><div class="sc-eykeme-2 ixCZoP" style="opacity: 0;"><svg width="80" height="80"><use xlink:href="/chunks/icons/common-icons-355a22d8.svg#icon-bms-gray"></use></svg></div><img alt="" width="100%" height="100%" class="sc-eykeme-1 jbzDld" style="border-radius: 0px; opacity: 1; transition: all 0.5s ease 0s; width: 100%; min-height: inherit; max-height: inherit;" src="https://assets-in.bmscdn.com/discovery-catalog/collections/tr:w-800,h-800:ote-MTEwKyBFdmVudHM%3D,otc-FFFFFF,otf-Roboto,ots-64,ox-48,oy-320,ott-b:w-300:q-80/comedy-shows-collection-202007220710.png"></div></div></div><div class="sc-133848s-3 cWbeuJ"></div></div></a></div><div><a href="https://in.bookmyshow.com/explore/music-shows-national-capital-region-ncr?referrerBase=" class="sc-133848s-11 sc-lnhrs7-3 bGSYo"><div class="sc-dv5ht7-0 eQcIov"><div class="sc-133848s-2 sc-5afure-0 bgaHZL"></div><div width="100%" height="100%" data-content="" class="sc-133848s-2 sc-1t5vwh0-0 dZlGtG"><div class="sc-133848s-2 sc-1t5vwh0-1 TsmVt"><div height="100%" width="100%" class="sc-eykeme-0 XxsAZ" style="background: none;"><div class="sc-eykeme-2 ixCZoP" style="opacity: 0;"><svg width="80" height="80"><use xlink:href="/chunks/icons/common-icons-355a22d8.svg#icon-bms-gray"></use></svg></div><img alt="" width="100%" height="100%" class="sc-eykeme-1 jbzDld" style="border-radius: 0px; opacity: 1; transition: all 0.5s ease 0s; width: 100%; min-height: inherit; max-height: inherit;" src="https://assets-in.bmscdn.com/discovery-catalog/collections/tr:w-800,h-800:ote-MTArIEV2ZW50cw%3D%3D,otc-FFFFFF,otf-Roboto,ots-64,ox-48,oy-320,ott-b:w-300:q-80/music-shows-collection-202007220710.png"></div></div></div><div class="sc-133848s-3 cWbeuJ"></div></div></a></div><div><div style="height: 0px;"></div></div><div><div style="height: 0px;"></div></div><div><div style="height: 0px;"></div></div><div><div style="height: 0px;"></div></div><div><div style="height: 0px;"></div></div><div><div style="height: 0px;"></div></div><div><div style="height: 0px;"></div></div></div><div class="sc-133848s-1 sc-lnhrs7-4 sc-lnhrs7-6 fSbmFf"><div class="sc-lnhrs7-7 faepMR"><svg xmlns="http://www.w3.org/2000/svg" viewBox="-1 -1 21 35"><g fill="#ffffff" fill-rule="evenodd"><path d="M1.276 31.647a1.543 1.543 0 01.033-2.17l14.59-14.09a1.531 1.531 0 012.171.043c.59.61.566 1.592-.033 2.17L3.447 31.69a1.531 1.531 0 01-2.17-.043z"></path><path d="M1.276 1.43A1.543 1.543 0 001.31 3.6L15.9 17.69a1.531 1.531 0 002.171-.043 1.543 1.543 0 00-.033-2.17L3.447 1.387a1.531 1.531 0 00-2.17.043z"></path></g></svg></div></div></div></div></div></div></div></div>
  <div><div class="sc-133848s-3 sc-133848s-5 gqBECX" style="background-color: rgb(43, 49, 72);"><div class="sc-133848s-3 sc-133848s-10 hSMUVB" style="padding: 32px 0px 16px;"><div class="sc-133848s-3 cWbeuJ"><div class="sc-133848s-2 sc-291x3n-0 lmknRz"><div class="sc-133848s-2 sc-291x3n-1 eQCApE"></div></div></div><div class="sc-1ljcxl3-0 dujqKk" style="display: grid; gap: 0px; grid-template-columns: repeat(1, calc((100% - 0px) / 1));"><a href="#" class="sc-133848s-11 sc-1ljcxl3-1 eQiiBj"><div class="sc-dv5ht7-0 eQcIov"><div class="sc-133848s-2 sc-5afure-0 bgaHZL"></div><div width="100%" height="100%" data-content="" class="sc-133848s-2 sc-1t5vwh0-0 dEJMYD"><div class="sc-133848s-2 sc-1t5vwh0-1 TsmVt"><div height="100%" width="100%" class="sc-eykeme-0 XxsAZ" style="background: none;"><div class="sc-eykeme-2 ixCZoP" style="opacity: 0;"><svg width="80" height="80"><use xlink:href="/chunks/icons/common-icons-355a22d8.svg#icon-bms-gray"></use></svg></div><img alt="" width="100%" height="100%" class="sc-eykeme-1 jbzDld" style="border-radius: 0px; opacity: 1; transition: all 0.5s ease 0s; width: 100%; min-height: inherit; max-height: inherit;" src="https://assets-in.bmscdn.com/discovery-catalog/collections/tr:w-1440,h-120:q-80/premiere-rupay-banner-web-collection-202104230555.png"></div></div></div><div class="sc-133848s-3 cWbeuJ"></div></div></a></div></div></div></div>
  <div><div class="sc-133848s-4 kRasMp"><div class="sc-133848s-3 sc-133848s-5 gqBECX" style="background-color: rgb(43, 49, 72);"><div class="sc-133848s-3 sc-133848s-10 hSMUVB" style="padding: 32px 0px;"><div class="sc-133848s-3 cWbeuJ" style="margin: 0px 0px 8px; padding: 0px;"><div class="sc-133848s-2 sc-291x3n-0 lmknRz"><div class="sc-133848s-2 sc-291x3n-1 eQCApE"><div class="sc-7o7nez-0 eehsuy">Premieres</div></div></div><div class="sc-7o7nez-0 hRMGTS">Brand new releases every Friday</div></div><div class="sc-lnhrs7-0 bKwTw"><div class="sc-lnhrs7-1 iVNURo"><div class="sc-lnhrs7-2 dhpnJW"><a href="https://in.bookmyshow.com/national-capital-region-ncr/movies/the-calm-beyond/ET00321626" class="sc-133848s-11 sc-lnhrs7-3 bGSYo"><div class="sc-dv5ht7-0 eQcIov"><div class="sc-133848s-2 sc-5afure-0 bgaHZL"></div><div width="100%" height="100%" data-content="The Calm Beyond" class="sc-133848s-2 sc-1t5vwh0-0 bJYQAU"><div class="sc-133848s-2 sc-1t5vwh0-1 TsmVt"><div height="100%" width="100%" class="sc-eykeme-0 XxsAZ" style="background: none;"><div class="sc-eykeme-2 ixCZoP" style="opacity: 0;"><svg width="80" height="80"><use xlink:href="/chunks/icons/common-icons-355a22d8.svg#icon-bms-gray"></use></svg></div><img alt="The Calm Beyond" width="100%" height="100%" class="sc-eykeme-1 jbzDld" style="border-radius: 0px; opacity: 1; transition: all 0.5s ease 0s; width: 100%; min-height: inherit; max-height: inherit;" src="https://assets-in.bmscdn.com/discovery-catalog/events/tr:w-400,h-600,bg-CCCCCC:oi-discovery-catalog@@icons@@premiere-icon.png,ox-322,oy-20:q-80/et00321626-vvkyjljnab-portrait.jpg"></div></div></div><div class="sc-133848s-3 cWbeuJ" style="margin: 4px 0px 0px; padding: 4px 0px 0px;"><div class="sc-133848s-2 sc-133848s-12 WfspT"><div class="sc-7o7nez-0 dIoSbl">The Calm Beyond</div></div><div class="sc-133848s-2 sc-133848s-12 WfspT"><div class="sc-7o7nez-0 fuIDPj">English</div></div></div></div></a><a href="https://in.bookmyshow.com/national-capital-region-ncr/movies/resident-evil-welcome-to-raccoon-city/ET00316029" class="sc-133848s-11 sc-lnhrs7-3 bGSYo"><div class="sc-dv5ht7-0 eQcIov"><div class="sc-133848s-2 sc-5afure-0 bgaHZL"></div><div width="100%" height="100%" data-content="Resident Evil: Welcome To Raccoon City" class="sc-133848s-2 sc-1t5vwh0-0 bJYQAU"><div class="sc-133848s-2 sc-1t5vwh0-1 TsmVt"><div height="100%" width="100%" class="sc-eykeme-0 XxsAZ" style="background: none;"><div class="sc-eykeme-2 ixCZoP" style="opacity: 0;"><svg width="80" height="80"><use xlink:href="/chunks/icons/common-icons-355a22d8.svg#icon-bms-gray"></use></svg></div><img alt="Resident Evil: Welcome To Raccoon City" width="100%" height="100%" class="sc-eykeme-1 jbzDld" style="border-radius: 0px; opacity: 1; transition: all 0.5s ease 0s; width: 100%; min-height: inherit; max-height: inherit;" src="https://assets-in.bmscdn.com/discovery-catalog/events/tr:w-400,h-600,bg-CCCCCC:oi-discovery-catalog@@icons@@premiere-icon.png,ox-322,oy-20:q-80/et00316029-fysbylxqyn-portrait.jpg"></div></div></div><div class="sc-133848s-3 cWbeuJ" style="margin: 4px 0px 0px; padding: 4px 0px 0px;"><div class="sc-133848s-2 sc-133848s-12 WfspT"><div class="sc-7o7nez-0 dIoSbl">Resident Evil: Welcome To Raccoon City</div></div><div class="sc-133848s-2 sc-133848s-12 WfspT"><div class="sc-7o7nez-0 fuIDPj">English</div></div></div></div></a><a href="https://in.bookmyshow.com/national-capital-region-ncr/movies/our-friend/ET00137401" class="sc-133848s-11 sc-lnhrs7-3 bGSYo"><div class="sc-dv5ht7-0 eQcIov"><div class="sc-133848s-2 sc-5afure-0 bgaHZL"></div><div width="100%" height="100%" data-content="Our Friend" class="sc-133848s-2 sc-1t5vwh0-0 bJYQAU"><div class="sc-133848s-2 sc-1t5vwh0-1 TsmVt"><div height="100%" width="100%" class="sc-eykeme-0 XxsAZ" style="background: none;"><div class="sc-eykeme-2 ixCZoP" style="opacity: 0;"><svg width="80" height="80"><use xlink:href="/chunks/icons/common-icons-355a22d8.svg#icon-bms-gray"></use></svg></div><img alt="Our Friend" width="100%" height="100%" class="sc-eykeme-1 jbzDld" style="border-radius: 0px; opacity: 1; transition: all 0.5s ease 0s; width: 100%; min-height: inherit; max-height: inherit;" src="https://assets-in.bmscdn.com/discovery-catalog/events/tr:w-400,h-600,bg-CCCCCC:oi-discovery-catalog@@icons@@premiere-icon.png,ox-322,oy-20:q-80/et00137401-rdkfjkzeyn-portrait.jpg"></div></div></div><div class="sc-133848s-3 cWbeuJ" style="margin: 4px 0px 0px; padding: 4px 0px 0px;"><div class="sc-133848s-2 sc-133848s-12 WfspT"><div class="sc-7o7nez-0 dIoSbl">Our Friend</div></div><div class="sc-133848s-2 sc-133848s-12 WfspT"><div class="sc-7o7nez-0 fuIDPj">English</div></div></div></div></a><a href="https://in.bookmyshow.com/national-capital-region-ncr/movies/martyrs-lane/ET00321514" class="sc-133848s-11 sc-lnhrs7-3 bGSYo"><div class="sc-dv5ht7-0 eQcIov"><div class="sc-133848s-2 sc-5afure-0 bgaHZL"></div><div width="100%" height="100%" data-content="Martyrs Lane" class="sc-133848s-2 sc-1t5vwh0-0 bJYQAU"><div class="sc-133848s-2 sc-1t5vwh0-1 TsmVt"><div height="100%" width="100%" class="sc-eykeme-0 XxsAZ" style="background: none;"><div class="sc-eykeme-2 ixCZoP" style="opacity: 0;"><svg width="80" height="80"><use xlink:href="/chunks/icons/common-icons-355a22d8.svg#icon-bms-gray"></use></svg></div><img alt="Martyrs Lane" width="100%" height="100%" class="sc-eykeme-1 jbzDld" style="border-radius: 0px; opacity: 1; transition: all 0.5s ease 0s; width: 100%; min-height: inherit; max-height: inherit;" src="https://assets-in.bmscdn.com/discovery-catalog/events/tr:w-400,h-600,bg-CCCCCC:oi-discovery-catalog@@icons@@premiere-icon.png,ox-322,oy-20:q-80/et00321514-sqfcnfjpub-portrait.jpg"></div></div></div><div class="sc-133848s-3 cWbeuJ" style="margin: 4px 0px 0px; padding: 4px 0px 0px;"><div class="sc-133848s-2 sc-133848s-12 WfspT"><div class="sc-7o7nez-0 dIoSbl">Martyrs Lane</div></div><div class="sc-133848s-2 sc-133848s-12 WfspT"><div class="sc-7o7nez-0 fuIDPj">English</div></div></div></div></a><a href="https://in.bookmyshow.com/national-capital-region-ncr/movies/dear-mama/ET00321826" class="sc-133848s-11 sc-lnhrs7-3 bGSYo"><div class="sc-dv5ht7-0 eQcIov"><div class="sc-133848s-2 sc-5afure-0 bgaHZL"></div><div width="100%" height="100%" data-content="Dear Mama" class="sc-133848s-2 sc-1t5vwh0-0 bJYQAU"><div class="sc-133848s-2 sc-1t5vwh0-1 TsmVt"><div height="100%" width="100%" class="sc-eykeme-0 XxsAZ" style="background: none;"><div class="sc-eykeme-2 ixCZoP" style="opacity: 0;"><svg width="80" height="80"><use xlink:href="/chunks/icons/common-icons-355a22d8.svg#icon-bms-gray"></use></svg></div><img alt="Dear Mama" width="100%" height="100%" class="sc-eykeme-1 jbzDld" style="border-radius: 0px; opacity: 1; transition: all 0.5s ease 0s; width: 100%; min-height: inherit; max-height: inherit;" src="https://assets-in.bmscdn.com/discovery-catalog/events/tr:w-400,h-600,bg-CCCCCC:oi-discovery-catalog@@icons@@premiere-icon.png,ox-322,oy-20:q-80/et00321826-hsucwmbaxv-portrait.jpg"></div></div></div><div class="sc-133848s-3 cWbeuJ" style="margin: 4px 0px 0px; padding: 4px 0px 0px;"><div class="sc-133848s-2 sc-133848s-12 WfspT"><div class="sc-7o7nez-0 dIoSbl">Dear Mama</div></div><div class="sc-133848s-2 sc-133848s-12 WfspT"><div class="sc-7o7nez-0 fuIDPj">Dutch</div></div></div></div></a><a href="https://in.bookmyshow.com/national-capital-region-ncr/movies/nine-days/ET00321624" class="sc-133848s-11 sc-lnhrs7-3 bGSYo"><div class="sc-dv5ht7-0 eQcIov"><div class="sc-133848s-2 sc-5afure-0 bgaHZL"></div><div width="100%" height="100%" data-content="Nine Days" class="sc-133848s-2 sc-1t5vwh0-0 bJYQAU"><div class="sc-133848s-2 sc-1t5vwh0-1 TsmVt"><div height="100%" width="100%" class="sc-eykeme-0 XxsAZ"><div class="sc-eykeme-2 ixCZoP"><svg width="80" height="80"><use xlink:href="/chunks/icons/common-icons-355a22d8.svg#icon-bms-gray"></use></svg></div><img alt="Nine Days" width="100%" height="100%" class="sc-eykeme-1 jbzDld" style="border-radius: 0px; opacity: 0; transition: all 0.5s ease 0s; width: 100%; min-height: inherit; max-height: inherit;"></div></div></div><div class="sc-133848s-3 cWbeuJ" style="margin: 4px 0px 0px; padding: 4px 0px 0px;"><div class="sc-133848s-2 sc-133848s-12 WfspT"><div class="sc-7o7nez-0 dIoSbl">Nine Days</div></div><div class="sc-133848s-2 sc-133848s-12 WfspT"><div class="sc-7o7nez-0 fuIDPj">English</div></div></div></div></a><a href="https://in.bookmyshow.com/national-capital-region-ncr/movies/land/ET00321097" class="sc-133848s-11 sc-lnhrs7-3 bGSYo"><div class="sc-dv5ht7-0 eQcIov"><div class="sc-133848s-2 sc-5afure-0 bgaHZL"></div><div width="100%" height="100%" data-content="Land" class="sc-133848s-2 sc-1t5vwh0-0 bJYQAU"><div class="sc-133848s-2 sc-1t5vwh0-1 TsmVt"><div height="100%" width="100%" class="sc-eykeme-0 XxsAZ"><div class="sc-eykeme-2 ixCZoP"><svg width="80" height="80"><use xlink:href="/chunks/icons/common-icons-355a22d8.svg#icon-bms-gray"></use></svg></div><img alt="Land" width="100%" height="100%" class="sc-eykeme-1 jbzDld" style="border-radius: 0px; opacity: 0; transition: all 0.5s ease 0s; width: 100%; min-height: inherit; max-height: inherit;"></div></div></div><div class="sc-133848s-3 cWbeuJ" style="margin: 4px 0px 0px; padding: 4px 0px 0px;"><div class="sc-133848s-2 sc-133848s-12 WfspT"><div class="sc-7o7nez-0 dIoSbl">Land</div></div><div class="sc-133848s-2 sc-133848s-12 WfspT"><div class="sc-7o7nez-0 fuIDPj">English</div></div></div></div></a><a href="https://in.bookmyshow.com/national-capital-region-ncr/movies/the-high-note/ET00321096" class="sc-133848s-11 sc-lnhrs7-3 bGSYo"><div class="sc-dv5ht7-0 eQcIov"><div class="sc-133848s-2 sc-5afure-0 bgaHZL"></div><div width="100%" height="100%" data-content="The High Note" class="sc-133848s-2 sc-1t5vwh0-0 bJYQAU"><div class="sc-133848s-2 sc-1t5vwh0-1 TsmVt"><div height="100%" width="100%" class="sc-eykeme-0 XxsAZ"><div class="sc-eykeme-2 ixCZoP"><svg width="80" height="80">
    <use xlink:href="/chunks/icons/common-icons-355a22d8.svg#icon-bms-gray"></use></svg></div><img alt="The High Note" width="100%" height="100%" class="sc-eykeme-1 jbzDld" style="border-radius: 0px; opacity: 0; transition: all 0.5s ease 0s; width: 100%; min-height: inherit; max-height: inherit;"></div></div></div><div class="sc-133848s-3 cWbeuJ" style="margin: 4px 0px 0px; padding: 4px 0px 0px;"><div class="sc-133848s-2 sc-133848s-12 WfspT"><div class="sc-7o7nez-0 dIoSbl">The High Note</div></div><div class="sc-133848s-2 sc-133848s-12 WfspT"><div class="sc-7o7nez-0 fuIDPj">English</div></div></div></div></a><a href="https://in.bookmyshow.com/national-capital-region-ncr/movies/listen/ET00322945" class="sc-133848s-11 sc-lnhrs7-3 dBRjrb"><div class="sc-dv5ht7-0 eQcIov"><div class="sc-133848s-2 sc-5afure-0 bgaHZL"></div><div width="100%" height="100%" data-content="Listen" class="sc-133848s-2 sc-1t5vwh0-0 bJYQAU"><div class="sc-133848s-2 sc-1t5vwh0-1 TsmVt"><div height="100%" width="100%" class="sc-eykeme-0 XxsAZ"><div class="sc-eykeme-2 ixCZoP"><svg width="80" height="80"><use xlink:href="/chunks/icons/common-icons-355a22d8.svg#icon-bms-gray"></use></svg></div><img alt="Listen" width="100%" height="100%" class="sc-eykeme-1 jbzDld" style="border-radius: 0px; opacity: 0; transition: all 0.5s ease 0s; width: 100%; min-height: inherit; max-height: inherit;"></div></div></div><div class="sc-133848s-3 cWbeuJ" style="margin: 4px 0px 0px; padding: 4px 0px 0px;"><div class="sc-133848s-2 sc-133848s-12 WfspT"><div class="sc-7o7nez-0 dIoSbl">Listen</div></div><div class="sc-133848s-2 sc-133848s-12 WfspT"><div class="sc-7o7nez-0 fuIDPj">English</div></div></div></div></a></div><div class="sc-133848s-1 sc-lnhrs7-4 sc-lnhrs7-6 bdOlSv"><div class="sc-lnhrs7-7 faepMR"><svg xmlns="http://www.w3.org/2000/svg" viewBox="-1 -1 21 35"><g fill="#ffffff" fill-rule="evenodd"><path d="M1.276 31.647a1.543 1.543 0 01.033-2.17l14.59-14.09a1.531 1.531 0 012.171.043c.59.61.566 1.592-.033 2.17L3.447 31.69a1.531 1.531 0 01-2.17-.043z"></path><path d="M1.276 1.43A1.543 1.543 0 001.31 3.6L15.9 17.69a1.531 1.531 0 002.171-.043 1.543 1.543 0 00-.033-2.17L3.447 1.387a1.531 1.531 0 00-2.17.043z"></path></g></svg></div></div></div></div></div></div></div></div>
 <div wrap="wrap" class="sc-hwwEjo sc-ibxdXY dhhTOJ"><div wrap="wrap" class="sc-hwwEjo sc-RefOD vbOWS"><div class="sc-kfGgVZ sc-krvtoX sc-fOKMvo vSSSf"><div class="sc-hwwEjo eczCKF"><a href="https://support.bookmyshow.com/support/home?regionCode=NCR" class="sc-dUjcNx bHJIFp"><div class="sc-kPVwWT dgfVBj"><svg xmlns="http://www.w3.org/2000/svg" viewBox="-1 -1 102 102" id="icon-callcenter" width="100%" height="100%"><path d="M68.8 29.4c0-10.4-8.4-18.8-18.8-18.8S31.2 19 31.2 29.4 39.6 48.2 50 48.2s18.8-8.4 18.8-18.8zm-35.8 0c0-9.3 7.6-17 17-17 9.3 0 17 7.6 17 17 0 9.3-7.6 17-17 17-9.3 0-17-7.6-17-17z"></path><path d="M24 30.3c.5 0 .9-.4.9-.9C24.9 15.6 36.2 4.3 50 4.3s25.1 11.3 25.1 25.1c0 13.1-10.5 28.3-24.2 29v-3.9c0-.5-.4-.9-.9-.9s-.9.4-.9.9v8.6c0 .5.4.9.9.9s.9-.4.9-.9v-2.9c14.7-.7 26-16.8 26-30.8C76.9 14.6 64.8 2.5 50 2.5S23.1 14.6 23.1 29.4c0 .5.4.9.9.9z"></path><path d="M68.1 63c-.6-.2-1.2-.3-1.9-.3-.9 0-2.3.7-4.9 2.1-3.2 1.7-7.7 4-10.6 4-3.2 0-8-2.3-11.5-4-2.8-1.3-4.3-2-5.3-2-.7 0-1.3.1-1.9.3C16.7 68.2 11.2 86 11.2 96.7c0 .5.4.9.9.9H88c.5 0 .9-.4.9-.9 0-10.8-5.6-28.6-20.8-33.7zM13 95.7c.3-12.1 7.2-26.8 19.6-30.9.4-.1.8-.2 1.3-.2.6 0 2.7 1 4.5 1.9 3.9 1.9 8.7 4.2 12.3 4.2 3.3 0 7.8-2.3 11.4-4.2 1.6-.8 3.6-1.9 4.1-1.9s.9.1 1.3.2C79.9 68.9 86.7 83.6 87 95.7H13zm3.6-55.3c.5 0 .9-.4.9-.9V26.3c0-.5-.4-.9-.9-.9s-.9.4-.9.9v13.2c0 .5.4.9.9.9zm66.8 0c.5 0 .9-.4.9-.9V26.3c0-.5-.4-.9-.9-.9s-.9.4-.9.9v13.2c-.1.5.4.9.9.9z"></path></svg></div><div class="sc-kfGgVZ sc-kIPQKe sc-gHboQg bynszQ">24/7 CUSTOMER CARE</div></a><a class="sc-dUjcNx bHJIFp"><div class="sc-kPVwWT dgfVBj"><svg xmlns="http://www.w3.org/2000/svg" viewBox="-1 -1 102 102" id="icon-resend" width="100%" height="100%"><path d="M92.1 69l-5.6-13.9a1 1 0 0 0-1.1-.5c-1.9.8-4.1-.2-4.8-2.1-.4-.9-.4-1.9 0-2.8.4-.9 1.1-1.6 2-2 .2-.1.4-.2.5-.4s.1-.4 0-.6l-5.6-13.9a1 1 0 0 0-1.1-.5L61 38.5l9-20.9c.2-.4 0-.9-.4-1.1L57 11.1c-.4-.2-.9 0-1.1.4a3.3 3.3 0 0 1-4.3 1.8c-.8-.3-1.4-1-1.8-1.8-.3-.8-.3-1.7 0-2.5.1-.2.1-.4 0-.6-.1-.2-.2-.4-.4-.5L36.8 2.6c-.4-.2-.9 0-1.1.4L12.3 58.2l-3.9 1.5c-.2.2-.4.3-.4.5-.1.2-.1.4 0 .6l5.6 13.9c.2.4.7.6 1.1.5 1.9-.7 4.1.2 4.8 2 .4.9.4 1.9 0 2.8s-1.1 1.6-2 2c-.2.1-.4.2-.5.4-.1.2-.1.4 0 .6l5.4 14c.1.2.2.4.4.5.1 0 .2.1.3.1.1 0 .2 0 .3-.1l68.1-27.3c.5-.2.7-.7.6-1.2zM36.9 4.4L48 9.1c-.2 1-.2 2 .2 3 .5 1.2 1.4 2.2 2.7 2.7 2.3 1 4.8.1 6.1-1.9l11.1 4.7-9.3 21.8-4.7 1.9L59 30.2l2.5-5.8c.1-.2.1-.4 0-.6s-.2-.4-.4-.5L38 13.5c-.2-.1-.4-.1-.6 0-.2.1-.4.2-.5.4L19.1 55.5l-4.7 1.9 22.5-53zm-1.4 16.7l.8.3c.1 0 .2.1.3.1.3 0 .6-.2.8-.5.2-.4 0-.9-.4-1.1l-.8-.3 1.8-4.3 21.6 9.2-1.8 4.3-.8-.4c-.4-.2-.9 0-1.1.4-.2.4 0 .9.4 1.1l.8.3-5.1 12-30.7 12.4 14.2-33.5zM23.7 95.6l-5-12.4c1-.6 1.7-1.4 2.2-2.5.6-1.3.6-2.8 0-4.1-.8-2-2.8-3.4-5-3.4-.4 0-.8 0-1.2.1L9.8 61l66.5-26.7 5 12.4c-1 .6-1.7 1.4-2.2 2.5a4.9 4.9 0 0 0 0 4.1c.8 2 2.8 3.4 5 3.4.4 0 .8 0 1.2-.1l5 12.4-66.6 26.6z"></path><path d="M70 42.1c-.1-.2-.2-.4-.4-.5-.2-.1-.4-.1-.6 0L20.2 61.2a1 1 0 0 0-.5 1.1L30 87.8c.1.2.2.4.4.5.1 0 .2.1.3.1.1 0 .2 0 .3-.1l42.3-17 6.4-2.6c.4-.2.6-.7.5-1.1L70 42.1zm3.5 27.3l-.3-.8a1 1 0 0 0-1.1-.5 1 1 0 0 0-.5 1.1l.4.8-34.2 13.7-.3-.7a1 1 0 0 0-1.1-.5 1 1 0 0 0-.5 1.1l.3.8-5.1 2-9.6-23.9 5.1-2 .3.8c.1.3.4.5.8.5.1 0 .2 0 .3-.1.4-.2.6-.7.5-1.1l-.3-.8 34.1-13.7.3.8c.1.3.4.5.8.5.1 0 .2 0 .3-.1.4-.2.6-.7.5-1.1l-.3-.8 4.9-2 9.6 23.9-4.9 2.1z"></path><path d="M30.6 65.7c-.2-.4-.7-.6-1.1-.5s-.6.7-.5 1.1l1.4 3.4c.1.3.4.5.8.5.1 0 .2 0 .3-.1.4-.2.6-.7.5-1.1l-1.4-3.3zm3.5 8.6a1 1 0 0 0-1.1-.5 1 1 0 0 0-.5 1.1l1.4 3.4c.1.3.4.5.8.5.1 0 .2 0 .3-.1.4-.2.6-.7.5-1.1l-1.4-3.3zm32.2-22.9a1 1 0 0 0-1.1-.5 1 1 0 0 0-.5 1.1l1.4 3.4c.1.3.4.5.8.5.1 0 .2 0 .3-.1.4-.2.6-.7.5-1.1l-1.4-3.3zm1.9 9.3l1.4 3.4c.1.3.4.5.8.5.1 0 .2 0 .3-.1.4-.2.6-.7.5-1.1L69.7 60a1 1 0 0 0-1.1-.5c-.4.2-.6.7-.4 1.2zm-19.5-34l3.1 1.3c.1 0 .2.1.3.1.3 0 .6-.2.8-.5.2-.4 0-.9-.4-1.1l-3.1-1.3c-.4-.2-.9 0-1.1.4-.3.4-.1.9.4 1.1zm-7.8-3.3l3.1 1.3c.1 0 .2.1.3.1.3 0 .6-.2.8-.5.2-.4 0-.9-.4-1.1l-3.1-1.3c-.4-.2-.9 0-1.1.4-.2.4 0 .9.4 1.1zm13.4 41.4c-.5 0-.8.4-.8.8 0 2.4-2 4.4-4.4 4.4s-4.4-2-4.4-4.4c0-2.3 1.9-4.2 4.2-4.3l-1.6 2.3c-.3.4-.2.9.2 1.2.1.1.3.1.5.1.3 0 .5-.1.7-.4l2.6-3.7c.3-.4.2-.9-.2-1.1L47.5 57c-.4-.3-.9-.2-1.2.2s-.2.9.2 1.2l1.9 1.4c-3 .3-5.4 2.9-5.4 5.9 0 3.3 2.7 6 6 6s6-2.7 6-6c.1-.5-.3-.9-.7-.9z"></path></svg></div><div class="sc-kfGgVZ sc-kIPQKe sc-gHboQg bynszQ">RESEND BOOKING CONFIRMATION</div></a><a class="sc-dUjcNx bHJIFp"><div class="sc-kPVwWT dgfVBj"><svg xmlns="http://www.w3.org/2000/svg" id="icon-newsletter" viewBox="-1 -1 102 102" width="100%" height="100%"><g id="elnewsletter"><path class="elst0" d="M97.5 90.3V33.6c0-.5-.4-1-1-1H82.9V9.8c0-.5-.4-1-1-1H18.1a1 1 0 0 0-1 1v22.8H3.5a1 1 0 0 0-1 1v56.9c0 .1.1.1.1.2v.1c0 .1.1.1.2.1.1.1.2.1.2.1.1 0 .1 0 .2.1h93.4c.1 0 .3 0 .4-.1 0 0 .1 0 .1-.1.1-.1.2-.1.2-.2v-.1c0-.1.1-.1.1-.2.1 0 .1 0 .1-.1zm-1.9-55.7v53.6L63.9 64.1l18.6-17.7 7.7-7.4c.3-.3.4-.7.2-1.1-.1-.4-.5-.6-.9-.6h-6.8v-2.7h12.9zM50.2 56.1l43.4 33.1H6.4l43.8-33.1zm32.7-16.8h4.4l-4.4 4.1v-4.1zM19.1 10.8h61.8v34.5L62.4 62.9l-11.6-8.8c-.3-.3-.8-.3-1.2 0L37.8 63 19.1 45.3V10.8zm-2 32.6l-4.4-4.1h4.4v4.1zm0-8.8v2.7h-6.8c-.4 0-.8.2-.9.6-.1.4-.1.8.2 1.1l26.5 25.2-31.8 24V34.6h12.8z"></path><path class="elst0" d="M28.9 22.5h42.7a1 1 0 0 0 0-2H28.9c-.5 0-1 .4-1 1s.4 1 1 1zm0 10h42.7a1 1 0 0 0 0-2H28.9a1 1 0 0 0 0 2zm0 9.9h42.7a1 1 0 0 0 0-2H28.9c-.5 0-1 .4-1 1s.4 1 1 1z"></path></g></svg></div><div class="sc-kfGgVZ sc-kIPQKe sc-gHboQg bynszQ">SUBSCRIBE TO THE NEWSLETTER</div></a></div></div></div></div>
  
</template>

<script>
import axios from 'axios'
export default {
    name: 'HomePage',
    data () {
        return {
            cities: [],
            movies: [],
            rowsLength: 0,
            selectedCity: "",
            imageName: "batman.jpg"
        }
    },
    methods : {
        getCities() {
            axios.get('http://localhost:8081/api/cities')
                .then((response) => {
                    console.log(response.data)
                    this.cities = response.data;
                    this.selectedCity = this.cities[0].name;
                    this.getMovies(this.selectedCity);
                    //this.rowsLength = Math.ceil(response.data.length/6);
                })
                .catch((error) => {
                    console.log(error)
                })
        },
        getMovies(cityName) {
            this.movies = [];
            this.selectedCity = cityName;
            axios.get('http://localhost:8081/api/movies/'+this.selectedCity)
                .then((response) => {
                    console.log(response.data)
                    this.movies = response.data
                    
                })
                .catch((error) => {
                    console.log(error)
                })

        }
    },
    beforeMount(){
        this.getCities();
    }
}
</script>

<style>
h3 {
  float: left;
  margin-bottom: 20px;
  margin-top: 20px;
  margin-left:10px;
  text-align: left !important;
  width: 100%;
}

.card {
    background-color: rgb(252, 250, 250);
}

.card-margin {
    margin-top: 10px;
}

.container-fluid{
      padding-left: 0;
      padding-right: 0;
}

.cursor{
    cursor: pointer;
}
.gqBECX {
    display: flex;
    flex-direction: column;
    position: relative;
    z-index: unset;
}
.hSMUVB {
    margin: 0px auto;
    width: 92vw;
    max-width: 1240px;
}
.hSMUVB {
    display: flex;
    flex-direction: column;
    -webkit-box-pack: center;
    justify-content: center;
}
.cWbeuJ {
    display: flex;
    flex-direction: column;
}
.lmknRz {
    display: flex;
    -webkit-box-align: center;
    align-items: center;
}
.eQCApE {
    display: flex;
    margin: 0px auto 0px 0px;
}
.kdBsqY {
    word-break: break-word;
    color: rgb(51, 51, 51);
    font-family: Roboto;
    font-size: 24px;
    font-weight: 700;
    line-height: 1.17;
}
.bYEMkh {
    text-decoration: none;
}
a {
    background: #0000;
    font-size: 100%;
    margin: 0;
    padding: 0;
    text-decoration: none;
    vertical-align: initial;
}
.gUjRuq {
    margin: 0px;
    word-break: break-word;
    color: rgb(220, 53, 88);
    font-family: Roboto;
    font-size: 14px;
    font-weight: normal;
    line-height: 1.43;
}
.bKwTw {
    position: relative;
    cursor: pointer;
}
.iVNURo {
    overflow: hidden;
}
.eQezya {
    overflow: visible;
    transform: translateX(0px);
}
.eQezya {
    scroll-behavior: smooth;
    transition: transform 1000ms ease 0s;
    overscroll-behavior-x: contain;
    padding: 0px;
    display: grid;
    grid-template-columns: repeat(10, calc((100% - 128px) / 5));
    grid-template-rows: repeat(1, 1fr);
    grid-auto-flow: column;
    gap: 8px 32px;
    transform: initial;
}
.bGSYo {
    text-decoration: none;
    display: block;
}
.gQlIVy {
    display: flex;
    position: relative;
    -webkit-box-align: center;
    align-items: center;
    overflow: hidden;
    transition: height 0.3s ease-in 0s, width 0.3s ease-in 0s;
    width: 100%;
    height: calc(378.064px);
    max-height: unset;
    margin: 0px 0px 8px;
    border-radius: 8px;
}
.TsmVt {
    display: flex;
    height: 100%;
    width: 100%;
}
.TsmVt img {
    object-fit: cover;
    transition: visibility 0s ease 0s, opacity 0.3s linear 0s;
    opacity: 1;
    visibility: visible;
}
embed, img, object {
    max-width: 100%;
}
.cWbeuJ {
    display: flex;
    flex-direction: column;
}
.WfspT {
    display: flex;
    flex-wrap: wrap;
    -webkit-box-align: center;
    align-items: center;
}
.ksSobQ {
    margin: 0px 0px 4px;
    word-break: break-word;
    color: rgb(34, 34, 34);
    font-family: Roboto;
    font-size: 18px;
    font-weight: 500;
    line-height: 1.33;
    overflow: hidden;
    text-overflow: ellipsis;
    display: -webkit-box;
    -webkit-line-clamp: 2;
    -webkit-box-orient: vertical;
    text-align: left;
}
.faepMR {
    width: 18px;
    height: 18px;
}
.gILSGQ {
    display: flex;
}
.gILSGQ {
    display: none;
    -webkit-box-align: center;
    align-items: center;
    -webkit-box-pack: center;
    justify-content: center;
    position: absolute;
    cursor: pointer;
    width: 40px;
    height: 40px;
    background-color: rgb(102, 102, 102);
    top: calc(169.04px);
    border-radius: 20px;
    right: -20px;
}
.Slider {
  margin: -8px;
  background: #dedede;
}
.WfspT {
    display: flex;
    flex-wrap: wrap;
    -webkit-box-align: center;
    align-items: center;
}
.ghpwgb {
    margin: 0px;
    word-break: break-word;
    color: rgb(102, 102, 102);
    font-family: Roboto;
    font-size: 16px;
    font-weight: normal;
    line-height: 1.5;
    overflow: hidden;
    text-overflow: ellipsis;
    display: -webkit-box;
    -webkit-line-clamp: 2;
    -webkit-box-orient: vertical;
}
.sc-133848s-4 {
  background: #0000;
    border: 0;
    font-size: 100%;
    font-weight: 400;
    margin: 0;
    padding: 0;
    vertical-align: initial;
}
.gqBECX {
    display: flex;
    flex-direction: column;
    position: relative;
    z-index: unset;
}
.hSMUVB {
    margin: 0px auto;
    width: 92vw;
    max-width: 1240px;
}
.cWbeuJ {
    display: flex;
    flex-direction: column;
}
.lmknRz {
    display: flex;
    -webkit-box-align: center;
    align-items: center;
}
.eQCApE {
    display: flex;
    margin: 0px auto 0px 0px;
}
.kdBsqY {
    word-break: break-word;
    color: rgb(51, 51, 51);
    font-family: Roboto;
    font-size: 24px;
    font-weight: 700;
    line-height: 1.17;
}
.bKwTw {
    position: relative;
    cursor: pointer;
}
.iVNURo {
    overflow: hidden;
}
.dLGdDF {
    overflow: visible;
    transform: translateX(0px);
}
.faepMR svg {
    width: 100%;
    height: 100%;
}
svg:not(:root) {
    overflow: hidden;
}
.faepMR {
    width: 18px;
    height: 18px;
}
.fSbmFf {
    display: none;
    -webkit-box-align: center;
    align-items: center;
    -webkit-box-pack: center;
    justify-content: center;
    position: absolute;
    cursor: pointer;
    width: 40px;
    height: 40px;
    background-color: rgb(102, 102, 102);
    top: calc(91.2px);
    border-radius: 20px;
    right: -20px;
}
.dLGdDF {
    scroll-behavior: smooth;
    transition: transform 1000ms ease 0s;
    overscroll-behavior-x: contain;
    padding: 0px;
    display: grid;
    grid-template-columns: repeat(12, calc((100% - 128px) / 5));
    grid-template-rows: repeat(1, 1fr);
    grid-auto-flow: column;
    gap: 8px 32px;
    
    transform: initial;
}
.bGSYo {
    text-decoration: none;
    display: block;
}
a {
    background: #0000;
    font-size: 100%;
    margin: 0;
    padding: 0;
    text-decoration: none;
    vertical-align: initial;
}
.eQcIov {
    position: relative;
    height: 100%;
}
.dZlGtG {
    height: calc(222.391px);
    max-height: calc(222.391px);
}
.dZlGtG {
    display: flex;
    position: relative;
    -webkit-box-align: center;
    align-items: center;
    overflow: hidden;
    transition: height 0.3s ease-in 0s, width 0.3s ease-in 0s;
    width: 100%;
    height: calc(222.391px);
    max-height: unset;
    border-radius: 8px;
}
.TsmVt {
    display: flex;
    height: 100%;
    width: 100%;
}
.XxsAZ {
    max-height: 100%;
    min-height: 100%;
    max-width: 100%;
    min-width: 100%;
    background: rgb(238, 238, 238);
    border-radius: 8px;
    position: relative;
    z-index: 1;
}
.ixCZoP {
    opacity: 1;
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    display: flex;
    -webkit-box-pack: center;
    justify-content: center;
    -webkit-box-align: center;
    align-items: center;
}
.hSMUVB {
    display: flex;
    flex-direction: column;
    -webkit-box-pack: center;
    justify-content: center;
}
.gqBECX {
    display: flex;
    flex-direction: column;
    position: relative;
    z-index: unset;
}
.hSMUVB {
    margin: 0px auto;
    width: 92vw;
    max-width: 1240px;
}
.cWbeuJ {
    display: flex;
    flex-direction: column;
}
.eQiiBj {
    text-decoration: none;
    display: block;
}
.dEJMYD {
    height: calc(103.333px);
    max-height: calc(103.333px);
}
.dEJMYD {
    display: flex;
    position: relative;
    -webkit-box-align: center;
    align-items: center;
    overflow: hidden;
    transition: height 0.3s ease-in 0s, width 0.3s ease-in 0s;
    width: 100%;
    height: calc(103.333px);
    max-height:unset
}
.hSMUVB {
    display: flex;
    flex-direction: column;
    -webkit-box-pack: center;
    justify-content: center;
}
.gqBECX {
    display: flex;
    flex-direction: column;
    position: relative;
    z-index: unset;
}
.hSMUVB {
    margin: 0px auto;
    width: 92vw;
    max-width: 1240px;
}
.lmknRz {
    display: flex;
    -webkit-box-align: center;
    align-items: center;
}
.eQCApE {
    display: flex;
    margin: 0px auto 0px 0px;
}
.eehsuy {
    word-break: break-word;
    color: rgb(255, 255, 255);
    font-family: Roboto;
    font-size: 24px;
    font-weight: 700;
    line-height: 1.17;
}
.hRMGTS {
    word-break: break-word;
    color: rgb(255, 255, 255);
    font-family: Roboto;
    font-size: 14px;
    font-weight: normal;
    line-height: 1.43;
}
.bKwTw {
    position: relative;
    cursor: pointer;
}
.iVNURo {
    overflow: hidden;
}
.dhpnJW {
    overflow: visible;
    transform: translateX(0px);
}
.bGSYo {
    text-decoration: none;
    display: block;
}
.eQcIov {
    position: relative;
    height: 100%;
}
.bgaHZL {
    display: flex;
    position: absolute;
    z-index: 2;
    top: 4px;
    right: 4px;
}
.bJYQAU {
    height: calc(333.569px);
    max-height: calc(333.569px);
}
.TsmVt {
    display: flex;
    height: 100%;
    width: 100%;
}
.XxsAZ {
    max-height: 100%;
    min-height: 100%;
    max-width: 100%;
    min-width: 100%;
    background: rgb(238, 238, 238);
    border-radius: 8px;
    position: relative;
    z-index: 1;
}
.ixCZoP {
    opacity: 1;
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    display: flex;
    -webkit-box-pack: center;
    justify-content: center;
    -webkit-box-align: center;
    align-items: center;
}
.TsmVt img {
    object-fit: cover;
    transition: visibility 0s ease 0s, opacity 0.3s linear 0s;
    opacity: 1;
    visibility: visible;
}
.dIoSbl {
    margin: 0px 0px 4px;
    word-break: break-word;
    color: rgb(255, 255, 255);
    font-family: Roboto;
    font-size: 18px;
    font-weight: 500;
    line-height: 1.33;
    overflow: hidden;
    text-overflow: ellipsis;
    display: -webkit-box;
    -webkit-line-clamp: 2;
    -webkit-box-orient: vertical;
    text-align: left;
}
.WfspT {
    display: flex;
    flex-wrap: wrap;
    -webkit-box-align: center;
    align-items: center;
}
.fuIDPj {
    margin: 0px;
    word-break: break-word;
    color: rgb(255, 255, 255);
    font-family: Roboto;
    font-size: 16px;
    font-weight: normal;
    line-height: 1.5;
    overflow: hidden;
    text-overflow: ellipsis;
    display: -webkit-box;
    -webkit-line-clamp: 2;
    -webkit-box-orient: vertical;
}
.jbzDld {
    border-radius: 8px;
    transition: all 0.5s ease 0s;
    width: 100%;
    min-height: inherit;
    max-height: inherit;
    opacity: 0;
    object-fit: cover;
}
.bJYQAU {
    display: flex;
    position: relative;
    -webkit-box-align: center;
    align-items: center;
    overflow: hidden;
    transition: height 0.3s ease-in 0s, width 0.3s ease-in 0s;
    width: 100%;
    height: calc(333.569px);
    max-height: unset;
    margin: 0px 0px 8px;
    border-radius: 8px;
}
.dhpnJW {
    scroll-behavior: smooth;
    transition: transform 1000ms ease 0s;
    overscroll-behavior-x: contain;
    padding: 0px;
    display: grid;
    grid-template-columns: repeat(9, calc((100% - 128px) / 5));
    grid-template-rows: repeat(1, 1fr);
    grid-auto-flow: column;
    gap: 8px 32px;
    transform: initial;
}
.fSbmFf {
    display: none;
    -webkit-box-align: center;
    align-items: center;
    -webkit-box-pack: center;
    justify-content: center;
    position: absolute;
    cursor: pointer;
    width: 40px;
    height: 40px;
    background-color: rgb(102, 102, 102);
    top: calc(91.2px);
    border-radius: 20px;
    right: -20px;
}
.faepMR {
    width: 18px;
    height: 18px;
    display: none;
}
.fSbmFf {
    display: flex;
}
.faepMR svg {
    width: 100%;
    height: 100%;
}
.fSbmFf {
    display: none;
    -webkit-box-align: center;
    align-items: center;
    -webkit-box-pack: center;
    justify-content: center;
    position: absolute;
    cursor: pointer;
    width: 40px;
    height: 40px;
    background-color: rgb(102, 102, 102);
    top: calc(91.2px);
    border-radius: 20px;
    right: -20px;
}
svg:not(:root) {
    overflow: hidden;
}
.hSMUVB {
    display: flex;
    flex-direction: column;
    -webkit-box-pack: center;
    justify-content: center;
}
.dhhTOJ {
    display: flex;
    flex-flow: row wrap;
    -webkit-box-pack: start;
    justify-content: start;
    -webkit-box-align: start;
    align-items: start;
    height: auto;
    overflow: visible;
    margin: 0px;
    width: 100%;
    background-color: rgb(64, 64, 67);
    padding: 0px;
}
.vbOWS {
    display: flex;
    flex-flow: row wrap;
    -webkit-box-pack: start;
    justify-content: start;
    -webkit-box-align: start;
    align-items: start;
    height: auto;
    overflow: visible;
    color: rgb(153, 153, 153);
    width: 100%;
    max-width: 1280px;
    margin: 0px auto;
    padding: 15px;
}
.vSSSf {
    padding: 0px;
    margin: 0px;
    flex-basis: auto;
    width: 100%;
    justify-content: space-around;
    -webkit-box-align: center;
    align-items: center;
}
.eczCKF {
    display: flex;
    flex-flow: row nowrap;
    justify-content: space-around;
    -webkit-box-align: start;
    align-items: start;
    width: auto;
    height: auto;
    overflow: visible;
    padding: 0px;
    margin: 0px;
}
.bHJIFp {
    display: inline-block;
    text-align: center;
    color: rgba(188, 192, 196, 0.74);
    text-decoration: none;
    cursor: pointer;
}
.dgfVBj {
    display: inline-block;
    margin: 0px;
    width: 50px;
    height: 50px;
}
.bHJIFp svg {
    fill: rgb(198, 198, 199);
}
.bynszQ {
    color: currentcolor;
    text-align: inherit;
    line-height: 18px;
    width: auto;
    padding: 0px;
    margin: 10px 0px 0px;
    flex-basis: auto;
    font-size: 11px;
}
.iETRcb {
    display: flex;
    flex-flow: row wrap;
    -webkit-box-pack: start;
    justify-content: start;
    -webkit-box-align: start;
    align-items: start;
    height: auto;
    overflow: visible;
    color: rgb(153, 153, 153);
    width: 100%;
    max-width: 1280px;
    margin: 0px auto 15px;
    padding: 0px 15px;
}
.ehqaQW {
    width: 100%;
    padding-top: 25px;
}
.dNNjdq {
    font-size: 12px;
    line-height: 1.1;
    font-weight: 400;
    letter-spacing: 0.1px;
    text-transform: uppercase;
    margin: 0px 0px 20px;
    color: rgb(165, 165, 165);
    text-align: left;
}
.hhkxDl {
    display: flex;
    padding: 0px 24px 20px;
    font-size: 11px;
    -webkit-box-align: center;
    align-items: center;
    flex-direction: column;
    background-color: rgb(51, 51, 56);
}
.daLgso {
    padding: 0px;
    margin: 0px;
    flex-basis: auto;
    width: 100%;
}
.mqFuI {
    display: flex;
    width: 100%;
    -webkit-box-align: center;
    align-items: center;
    -webkit-box-pack: center;
    justify-content: center;
    height: 125px;
}
.izRfKO {
    flex: 1 1 0%;
    height: 1px;
    background: rgb(93, 93, 95);
}
.izRfKO {
    flex: 1 1 0%;
    height: 1px;
    background: rgb(93, 93, 95);
}
.fjqhyD {
    text-align: center;
}
.hflvIy {
    display: inline-block;
    margin-right: 10px;
    width: 37px;
    height: 37px;
}
.fvYXPh {
    display: flex;
    flex-wrap: wrap;
}
.ielWRw {
    font-size: 11px;
    color: rgb(127, 127, 127);
    letter-spacing: 0.1px;
    text-decoration: none;
    transition: color 0.25s ease-in-out 0s;
    margin: 0px 5px 5px 0px;
    padding-right: 5px;
    border-right: 1px solid rgb(127, 127, 127);
}
.hKGiyW {
    display: flex;
    flex-flow: row wrap;
    -webkit-box-pack: start;
    justify-content: start;
    -webkit-box-align: start;
    align-items: start;
    height: auto;
    overflow: visible;
    margin: 0px;
    width: 100%;
    background-color: rgb(51, 51, 56);
    padding: 0px;
}

</style>