$(function(){
    $(".left_box dd").hide();
    $(".left_box dt").click(function(){
        $(".left_box dt").css({"background-color":"#3992d0"});
        $(this).css({"background-color": "#317eb4"});
        $(".left_box dt img").attr("src","images/select_xl01.png");
        $(this).parent().find('img').attr("src","images/select_xl.png");
        $(this).parent().find('dd').removeClass("menu_chioce");
        $(".menu_chioce").slideUp();
        $(this).parent().find('dd').slideToggle();
        $(this).parent().find('dd').addClass("menu_chioce");
    })
});
