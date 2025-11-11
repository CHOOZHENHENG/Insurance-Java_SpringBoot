google.charts.load("current", {packages:["corechart"]});
google.charts.setOnLoadCallback(drawHistogramChart);

function drawHistogramChart(){
   var driversViolationPointArray = [['Drivers', 'Total Violation Points']];

   vpByDriversData.forEach(function(item){
        driversViolationPointArray.push([item.idName, item.violationCount]);
   });

   var violationPointByDriversData = google.visualization.arrayToDataTable(driversViolationPointArray);

   var options = {
       title: "Violation Points Per Driver",
       legend: { position: 'none' }
   };

   var chart = new google.visualization.Histogram(document.getElementById("histDiv"));
   chart.draw(violationPointByDriversData, options);
}