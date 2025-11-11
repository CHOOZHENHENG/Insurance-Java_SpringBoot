google.charts.load("current", {packages:["corechart"]});
google.charts.setOnLoadCallback(drawBarChart);

function drawBarChart(){
   var vehicleMakeCountArray = [['Make', 'Count']];

   countVehicleMakeData.forEach(function(item){
        vehicleMakeCountArray.push([item.make, parseInt(item.count)]);
   });

   var vehicleMakeCountData = google.visualization.arrayToDataTable(vehicleMakeCountArray);

   var view = new google.visualization.DataView(vehicleMakeCountData);
   view.setColumns([0,1]);

   var options = {
       title: "Vehicle Make Count",
       bar: {groupWidth: "85%" },
       legend: {position: "none" }
   };

   var chart = new google.visualization.BarChart(document.getElementById("barDiv"));
   chart.draw(view, options);
}