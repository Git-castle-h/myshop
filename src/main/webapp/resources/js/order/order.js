let order_sum = document.querySelector(".order_sum");
let product_sum = document.querySelector(".product_sum .bottom");
let shipping_sum = document.querySelector(".shipping_sum .bottom");
let price_discount = document.querySelector(".price_discount .bottom");
let final_sum = document.querySelector(".final_sum .bottom");

let cart_line_arr = document.querySelectorAll(".cart_line");

// 장바구니 각 항목 가격을 모두 더해 product_sum에 설정
function price_set(){

    cart_line_arr.forEach(function(e){
            let p_sum = product_sum.innerHTML;
            let price = e.querySelector(".price_box .price").innerHTML;
            
            product_sum.innerHTML = parseInt(p_sum) + parseInt(price);

    });
}

price_set();

//배송지 주소 회원정보로 입력하는 기능

let address_form = document.querySelector(".address_form");
let address_check = address_form.querySelector(".address_check");

let address_post = address_form.querySelector(".address_postnum");
let address_basic = address_form.querySelector(".address_basic");
let address_detail = address_form.querySelector(".address_detail");

address_check.addEventListener("change",function(){

    if(address_check.checked){
        $.ajax({
            type:'POST',
            async:false,
            url:contextPath+"/order/myAddress.do",
            data:{
            },
            success:function(data,textStatus){
                address_post.value = data.address_post;
                address_basic.value = data.address_basic;
                address_detail.value = data.address_detail;

                console.log("작업이 순조롭게 진행되었습니다.");
            },
            error:function(data,textStatus){
                console.log("에러가 발생했습니다.");
            },
            complete:function(data,textStatus){
                console.log("작업을 완료했습니다.");
            }
            
        });
    }else{
        address_post.value = "";
        address_basic.value = "";
        address_detail.value = "";
    }

});

// 주문하기 기능

let order_btn  = document.querySelector(".order_btn");

order_btn.addEventListener("click",function(){

    let c_id_arr = [];

    cart_line_arr.forEach(function(i){

        let c_id = i.getAttribute("data-id");
        c_id_arr.push(c_id);

    });

    $.ajax({
        type:'POST',
        async:false,
        url:contextPath+"/order/order.do",
        data:{
            c_id_arr : c_id_arr,
            address_post : address_post.value,
            address_basic :address_basic.value,
            address_detail : address_detail.value
        },
        success:function(data,textStatus){
            alert("주문이 완료되었습니다.");
            location.href= contextPath+"/order/orderList";
        },
        error:function(data,textStatus){
            console.log("에러가 발생했습니다.");
        },
        complete:function(data,textStatus){
            console.log("작업을 완료했습니다.");
        }
        
    });

})