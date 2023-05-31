let buy_btn = document.querySelector(".buy_btn");
let cart_btn = document.querySelector(".cart_btn");

let select_input = document.querySelector(".select_input");
let plusMinus_input = document.querySelector(".plusMinus_input");


buy_btn.addEventListener("click",function(){

    $.ajax({
        type:'POST',
        async:false,
        url:contextPath+"/product/productDetail/productBuy.do",
        data:{
            p_option : select_input.value,
            p_number : plusMinus_input.value
        },
        success:function(data,textStatus){
            alert("장바구니로 이동합니다.");
            location.replace(contextPath+"/cart/cartList");
        },
        error:function(data,textStatus){
            alert("에러가 발생했습니다.");
        },
        complete:function(data,textStatus){
            // alert("작업을 완료했습니다.");
        }
        
    });

});