var app = new Vue({
    el: '#app',
    data: {
        selectMainpage : ''
    },
    methods : {
        handleMenuItemClick(val){
            console.log('menu item click', val.index);
            this.selectMainPage = val.index;
        }
    }
})