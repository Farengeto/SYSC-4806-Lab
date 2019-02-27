$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8080/buddies"
    }).then(function(data) {
        $('.buddy-name0').append(data._embedded.buddies[0].name);
        $('.buddy-number0').append(data._embedded.buddies[0].phoneNumber);
        $('.buddy-info0').append(data._embedded.buddies[0].info);
        $('.buddy-name1').append(data._embedded.buddies[1].name);
        $('.buddy-number1').append(data._embedded.buddies[1].phoneNumber);
        $('.buddy-info1').append(data._embedded.buddies[1].info);
        $('.buddy-name2').append(data._embedded.buddies[2].name);
        $('.buddy-number2').append(data._embedded.buddies[2].phoneNumber);
        $('.buddy-info2').append(data._embedded.buddies[2].info);
        $('.buddy-name3').append(data._embedded.buddies[3].name);
        $('.buddy-number3').append(data._embedded.buddies[3].phoneNumber);
        $('.buddy-info3').append(data._embedded.buddies[3].info);
        $('.buddy-name4').append(data._embedded.buddies[4].name);
        $('.buddy-number4').append(data._embedded.buddies[4].phoneNumber);
        $('.buddy-info4').append(data._embedded.buddies[4].info);
    });
});