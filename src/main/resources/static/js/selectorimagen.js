
let mainImg = document.getElementById("mainImg");
let itemImg = document.getElementsByClassName("itemImg");

itemImg[0].onclick = function(){
    mainImg.src = itemImg[0].src;
}

itemImg[1].onclick = function(){
    mainImg.src = itemImg[1].src;
}
itemImg[2].onclick = function(){
    mainImg.src = itemImg[2].src;
}
itemImg[3].onclick = function(){
    mainImg.src = itemImg[3].src;
}