let selectFind = document.querySelector(".selectFind");
let emailFind = document.querySelector(".emailFind");
let phoneFind = document.querySelector(".phoneFind");

selectFind.addEventListener("change",function(e){
    if(e.target.value =="email"){
        emailFind.style.display="block";
        phoneFind.style.display="none";
    }else{
        emailFind.style.display="none";
        phoneFind.style.display="block";
    }
});
