google.charts.load("current", {packages:["gauge"]});
google.charts.setOnLoadCallback(drawGaugeChart);

function drawGaugeChart(){
   var policiesCreatedPerYearArray = [['Years', 'Total Policies Created']];

   policiesYearData.forEach(function(item){
        policiesCreatedPerYearArray.push([item.year, item.policyCreated]);
   });

   var policiesPerYearData = google.visualization.arrayToDataTable(policiesCreatedPerYearArray);

   var options = {
       max: 200,
       redFrom: 170, redTo: 200,
       yellowFrom: 150, yellowTo: 170,
       minorTicks: 10,
       majorTicks: 5
   };

   var chart = new google.visualization.Gauge(document.getElementById("gaugeDiv"));
   chart.draw(policiesPerYearData, options);
}