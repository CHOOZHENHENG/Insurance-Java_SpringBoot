google.charts.load("current", {packages:["corechart"]});
google.charts.setOnLoadCallback(drawPieChart);

function drawPieChart(){
   var statesViolationPointArray = [['State', 'Total Violation Points']];

   vpByStatesData.forEach(function(item){
        statesViolationPointArray.push([item.state, item.violationPoint]);
   });

   var violationPointByStatesData = google.visualization.arrayToDataTable(statesViolationPointArray);

   var options = {
       title: "Violation Points By States"
   };

   var chart = new google.visualization.PieChart(document.getElementById("pieDiv"));
   chart.draw(violationPointByStatesData, options);
}