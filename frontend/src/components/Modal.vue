<template>
  <div class="modal-backdrop">
    <div class="modal">
      <header class="modal-header">
        <slot name="header">
          This is the default title!
        </slot>
        <button
          type="button"
          class="btn-close"
          @click="close"
        >
          x
        </button>
      </header>

      <section class="modal-body">
        <slot name="body">
        <div class="sc-ifAKCX gyrNMm in-animation"><div class="sc-EHOje hxnSva in-animation" opacity="1"><div direction="column" class="sc-iwsKbI sc-jkCMRl fnbtbz"><div class="sc-kVrTmx eQrGPf"><div class="sc-bhlBdH fxqTTD"><div class="sc-iwsKbI sc-AnqlK hAcDvP"><div class="sc-iwsKbI sc-keFjpB gJKrnm"><svg width="12" height="12" xmlns="http://www.w3.org/2000/svg"><title>Search</title><path d="M11.8 10.864L8.859 7.918a4.912 4.912 0 0 0-.444-6.47A4.888 4.888 0 0 0 4.928 0a4.888 4.888 0 0 0-3.485 1.449 4.942 4.942 0 0 0 0 6.979 4.888 4.888 0 0 0 3.485 1.449c1.052 0 2.105-.33 2.976-1.005l2.96 2.93a.658.658 0 0 0 .476.198.686.686 0 0 0 .477-.198.672.672 0 0 0-.016-.938zm-6.855-2.32c-.97 0-1.858-.38-2.549-1.054C1 6.09 1 3.802 2.396 2.387a3.578 3.578 0 0 1 2.549-1.054c.97 0 1.858.379 2.548 1.054s1.052 1.58 1.052 2.551c0 .971-.378 1.86-1.052 2.552a3.539 3.539 0 0 1-2.548 1.053z" fill="#777"></path></svg></div><input type="text" autocomplete="off" placeholder="Search for your city" class="sc-jWojfa eTcNgn" value=""></div></div></div><div class="sc-bIqbHp kxemWM"><span class="sc-jxGEyO dilUwd ">Popular Cities</span><ul class="sc-FQuPU eCIDPD"><li class="sc-bbkauy kLcptz"><div class="sc-fihHvN hHQYDi"><div class="sc-kEmuub eIdlDQ"><img src="//in.bmscdn.com/m6/images/common-modules/regions/mumbai.png" alt="MUMBAI"  @click="close" class="sc-bqjOQT aUKrX btn-close"></div><span class="sc-iuDHTM uqCMs">Mumbai</span></div><div class="sc-ghsgMZ jpTNpL"><div class="sc-dznXNo kFWlzx"></div></div></li><li class="sc-bbkauy kLcptz"><div class="sc-fihHvN TbrKo"><div class="sc-kEmuub eIdlDQ"><img src="//in.bmscdn.com/m6/images/common-modules/regions/ncr-selected.png"  @click="close" class="sc-bqjOQT aUKrX btn-close"></div><span class="sc-iuDHTM uqCMs">NCR</span></div></li><li class="sc-bbkauy kLcptz"><div class="sc-fihHvN TbrKo"><div class="sc-kEmuub eIdlDQ"><img src="//in.bmscdn.com/m6/images/common-modules/regions/bang.png" alt="BANG" @click="close" class="sc-bqjOQT aUKrX btn-close"></div><span class="sc-iuDHTM uqCMs">Bengaluru</span></div></li><li class="sc-bbkauy kLcptz"><div class="sc-fihHvN TbrKo"><div class="sc-kEmuub eIdlDQ"><img src="//in.bmscdn.com/m6/images/common-modules/regions/hyd.png" alt="HYD" @click="close" class="sc-bqjOQT aUKrX btn-close"></div><span class="sc-iuDHTM uqCMs">Hyderabad</span></div></li><li class="sc-bbkauy kLcptz"><div class="sc-fihHvN TbrKo"><div class="sc-kEmuub eIdlDQ"><img src="//in.bmscdn.com/m6/images/common-modules/regions/ahd.png" alt="AHD" @click="close" class="sc-bqjOQT aUKrX btn-close"></div><span class="sc-iuDHTM uqCMs">Ahmedabad</span></div></li><li class="sc-bbkauy kLcptz"><div class="sc-fihHvN TbrKo"><div class="sc-kEmuub eIdlDQ"><img src="//in.bmscdn.com/m6/images/common-modules/regions/chd.png" alt="CHD" @click="close" class="sc-bqjOQT aUKrX btn-close"></div><span class="sc-iuDHTM uqCMs">Chandigarh</span></div></li><li class="sc-bbkauy kLcptz"><div class="sc-fihHvN TbrKo"><div class="sc-kEmuub eIdlDQ"><img src="//in.bmscdn.com/m6/images/common-modules/regions/pune.png" alt="PUNE" @click="close" class="sc-bqjOQT aUKrX btn-close"></div><span class="sc-iuDHTM uqCMs">Pune</span></div></li><li class="sc-bbkauy kLcptz"><div class="sc-fihHvN TbrKo"><div class="sc-kEmuub eIdlDQ"><img src="//in.bmscdn.com/m6/images/common-modules/regions/chen.png" alt="CHEN" @click="close" class="sc-bqjOQT aUKrX btn-close"></div><span class="sc-iuDHTM uqCMs">Chennai</span></div></li><li class="sc-bbkauy kLcptz"><div class="sc-fihHvN TbrKo"><div class="sc-kEmuub eIdlDQ"><img src="//in.bmscdn.com/m6/images/common-modules/regions/kolk.png" alt="KOLK" @click="close" class="sc-bqjOQT aUKrX btn-close"></div><span class="sc-iuDHTM uqCMs">Kolkata</span></div></li><li class="sc-bbkauy kLcptz"><div class="sc-fihHvN TbrKo"><div class="sc-kEmuub eIdlDQ"><img src="//in.bmscdn.com/m6/images/common-modules/regions/koch.png" alt="KOCH" @click="close" class="sc-bqjOQT aUKrX btn-close"></div><span class="sc-iuDHTM uqCMs">Kochi</span></div></li></ul></div><div class="sc-bIqbHp kxemWM"><span cursor="pointer" color="#DC3558" class="sc-jxGEyO fQHEXW">View All Cities</span></div></div></div></div>
        </slot>
       </section>

      <footer class="modal-footer">
        <slot name="footer">
          This is the default footer!
        </slot>
        <button
          type="button"
          class="btn-green"
          @click="close"
        >
          Close Modal
        </button>
      </footer>
    </div>
  </div>
</template>

<script>
  export default {
    name: 'ModalM',
    methods: {
      close() {
        this.$emit('close');
      },
    },
  };
</script>
<style>
.gyrNMm.in-animation {
    animation: 0.5s cubic-bezier(0.165, 0.84, 0.44, 1) 0s 1 normal forwards running bSEuiG;
}
.gyrNMm {
    position: fixed;
    top: 0px;
    left: 0px;
    width: 100%;
    height: 100%;
    z-index: 500;
    background-color: rgba(0, 0, 0, 0.5);
    display: flex;
    flex-flow: row nowrap;
    -webkit-box-align: center;
    align-items: center;
    -webkit-box-pack: center;
    justify-content: center;
}
.hxnSva.in-animation {
    animation: 0.5s cubic-bezier(0.165, 0.84, 0.44, 1) 0s 1 normal forwards running cNPryj;
}
.fnbtbz {
    display: flex;
    flex-flow: column nowrap;
    -webkit-box-align: stretch;
    align-items: stretch;
    -webkit-box-pack: start;
    justify-content: flex-start;
    padding: 0px;
    margin: 0px;
    opacity: 1;
    width: 975px;
    position: relative;
}
.eQrGPf {
    position: relative;
}
.fxqTTD {
    padding: 15px;
}
.hAcDvP {
    display: flex;
    flex-flow: row nowrap;
    -webkit-box-pack: start;
    justify-content: flex-start;
    padding: 0px;
    margin: 0px;
    opacity: 1;
    width: 100%;
    -webkit-box-align: center;
    align-items: center;
    border: 1px solid rgb(241, 241, 241);
    border-radius: 2px;
}
.gJKrnm {
    display: flex;
    flex-flow: row nowrap;
    padding: 0px;
    margin: 0px;
    opacity: 1;
    width: 40px;
    height: 35px;
    -webkit-box-align: center;
    align-items: center;
    -webkit-box-pack: center;
    justify-content: center;
}   
.eTcNgn {
    width: 100%;
    height: 45px;
    border: none;
    font-size: 12px;
    text-indent: 15px;
    outline: none;
}
.kxemWM {
    padding: 15px;
    display: flex;
    max-width: 100%;
    -webkit-box-align: center;
    align-items: center;
    position: relative;
    flex-direction: column;
    -webkit-box-pack: center;
    justify-content: center;
    flex: 0 0 auto;
}
.dilUwd {
    font-size: 14px;
    width: fit-content;
    text-transform: none;
    color: rgb(51, 51, 51);
    cursor: default;
}
.eCIDPD {
    width: 100%;
    margin: 0px;
    display: flex;
    flex-wrap: wrap;
    position: relative;
    -webkit-box-align: center;
    align-items: center;
    -webkit-box-pack: center;
    justify-content: center;
    padding: 15px 15px 0px;
}
.kLcptz {
    display: flex;
    cursor: pointer;
    margin: 0px 10px;
    -webkit-box-align: center;
    align-items: center;
    flex-direction: column;
    -webkit-box-pack: start;
    justify-content: flex-start;
}
.TbrKo {
    display: flex;
    cursor: pointer;
    margin: 0px;
    -webkit-box-align: center;
    align-items: center;
    flex-direction: column;
    -webkit-box-pack: start;
    justify-content: flex-start;
    position: relative;
}
.eIdlDQ {
    width: 70px;
    height: 70px;
    display: flex;
    -webkit-box-align: center;
    align-items: center;
    padding-bottom: 5px;
    -webkit-box-pack: center;
    justify-content: center;
}
.aUKrX {
    height: 100%;
    max-width: 100%;
}
.hxnSva {
    background-color: rgb(255, 255, 255);
    opacity: 1;
    position: relative;
    top: 60px;
    display: flex;
    flex-direction: column;
    align-self: flex-start;
}
  .modal-backdrop {
    position: fixed;
    top: 0;
    bottom: 0;
    left: 0;
    right: 0;
    z-index: 99;
    background-color: rgba(0, 0, 0, 0.3);
    display: flex;
    justify-content: center;
    align-items: center;
  }

  .modal {
    background: #FFFFFF;
    box-shadow: 2px 2px 20px 1px;
    overflow-x: auto;
    display: flex;
    flex-direction: column;
  }

  .modal-header,
  .modal-footer {
    padding: 15px;
    display: flex;
  }

  .modal-header {
    position: relative;
    border-bottom: 1px solid #eeeeee;
    color: #4AAE9B;
    justify-content: space-between;
  }

  .modal-footer {
    border-top: 1px solid #eeeeee;
    flex-direction: column;
    justify-content: flex-end;
  }

  .modal-body {
    position: relative;
    padding: 20px 10px;
  }

  .btn-close {
    
    top: 0;
    right: 0;
    border: none;
    font-size: 20px;
    padding: 10px;
    cursor: pointer;
    font-weight: bold;
    color: #4AAE9B;
    background: transparent;
  }

  .btn-green {
    color: white;
    background: #4AAE9B;
    border: 1px solid #4AAE9B;
    border-radius: 2px;
  }
</style>