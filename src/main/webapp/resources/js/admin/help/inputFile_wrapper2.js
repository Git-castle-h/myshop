let inputFile_wrapper2 = document.querySelector(".inputFile_wrapper2");

inputFile_wrapper2.addEventListener("click",function(e){
    let file_input = e.currentTarget.querySelector(".file_input");
    let file_name = e.currentTarget.querySelector(".file_name");
    let file_btn = e.currentTarget.querySelector(".file_btn");

    file_input.click();

    file_input.addEventListener("change",function(e){
        let fileName ="";
        let path = file_input.value;
        let lastSlash = path.lastIndexOf("\\");
        fileName = path.slice(lastSlash+1);

        file_name.value = fileName;
    });

});