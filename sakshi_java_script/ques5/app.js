 var Employee=[
    {
        name:"sakshi",
        age:18,
        salary:800,
        dob:"02/05/95",
    },
    {
        name:"pooja",
        age:20,
        salary:5000,
        dob:"24/6/94",
    },
    {
        name:"Punit",
        age:19,
        salary:7000,
        dob:"13/10/94",
    },
    {
        name:"parul",
        age:22,
        salary:6000,
        dob:"20/07/94",
    },
    {
        name:"nikhil",
        age:17,
        salary:90,
        dob:"14/12/95",
    },
    {
        name:"deeksha",
        age:28,
        salary:15000,
        dob:"2/10/97",
    },
    {
        name:"sonali",
        age:22,
        salary:5100,
        dob:"21/12/96",
    }
]

for(var i = 0;i<Employee.length;i++){
    var name = Employee[i].name;
    var age = Employee[i].age;
    var salary = Employee[i].salary;
    var dob = Employee[i].dob;

    var table = document.getElementsByTagName('table')[0];
    var row = table.insertRow(1);

    var cel1 = row.insertCell(0);
    var cel2 = row.insertCell(1);
    var cel3 = row.insertCell(2);
    var cel4 = row.insertCell(3);

    cel1.innerHTML = name;
    cel2.innerHTML = age;
    cel3.innerHTML = salary;
    cel4.innerHTML = dob;

}

for(var i = 0 ; i < Employee.length; i++){
    if(Employee[i].salary>5000){

        document.write(Employee[i].name +" has salary greater than 5000 "+"<br>");
        //document.getElementById("demo" + Employee[i].name +" has salary greater than 5000 "+"<br>")
   }
}

document.write("The employees with salary less than 1000 and age greater than 20, giving them an increment 5 times their salary" + "<br>");
for(var i = 0 ; i < Employee.length; i++){
if(Employee[i].salary<1000 && Employee[i].age < 20 ){
 document.write(Employee[i].name +" incremented by 5 times " +Employee[i].salary*5 +"<br>");
}
}