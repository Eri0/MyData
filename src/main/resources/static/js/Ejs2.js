
$(function() {


    $.ajax({
        url: 'http://localhost:8080/SumAndDistrict',
        type: 'GET',
        dataType: 'json',
        timeout: 1000,
        cache: false,
        error: erryFunction,  //错误执行方法
        success: function(data){
            var dataZTZ  = [];
            var dataDQ = [];
            console.log(data);
            for (var i=0;i<data.length;i++){
                console.log(data[i])
                for(var key in data[i]){
                    if(key=="地区") {

                        dataDQ.push(data[i][key])
                    }
                    if(key=="地区总投资") {

                        dataZTZ.push(data[i][key])
                    }

                }

            }
            console.log(dataZTZ);
            console.log(dataDQ);

            var myChart = echarts.init(document.getElementById('main1'));

// 指定图表的配置项和数据
            var option = {
                title: {
                    text: '地区-总投资'
                },
                tooltip: {},
                legend: {
                    data:['投资']
                },
                xAxis: {
                    data: dataDQ
                },
                yAxis: {},
                series: [{
                    name: '投资',
                    type: 'bar',
                    data: dataZTZ
                }]
            };

// 使用刚指定的配置项和数据显示图表。
            myChart.setOption(option);
        }
    })
    function LoadFunction() {
        $("#list").html('加载中...');
    }
    function erryFunction() {
        alert("error");
    }

});
