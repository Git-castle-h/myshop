window.addEventListener("load",function(){
    let header = document.querySelector("#header");
    let main = document.querySelector("#main");

    headerHeight = header.clientHeight;
    console.log(headerHeight);
    main.style.minHeight = "calc( 100vh - "+headerHeight+"px )";
});

window.addEventListener("resize",function(){
    let header = document.querySelector("#header");
    let main = document.querySelector("#main");
    
    headerHeight = header.clientHeight;
    console.log(headerHeight);
    main.style.minHeight = "calc(100vh - "+headerHeight+"px)";
});