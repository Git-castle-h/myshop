let img_box = document.querySelectorAll(".img_box");
window.addEventListener("load",function(){
    img_box.forEach(function(e){
        let width = e.clientWidth;
        console.log(width);
        e.style.height = width*(1.4)+"px";
    })
});

window.addEventListener("resize",function(){
    img_box.forEach(function(e){
        let width = e.clientWidth;
        console.log(width);
        e.style.height = width*(1.4)+"px";
    })
});