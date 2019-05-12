var app = angular.module('spring', []);
app.controller('getAllContr', function($scope, $http) {
    $http.get("http://localhost:8080/rooms").then(function(response) {
        $scope.rooms = response.data;
    });
});



app.controller('editContr', function ($scope, $http) {

    $scope.id = null;
    $scope.isStatusOn = null;
    $scope.putdata = function (id, isStatusOn) {

        var data = {
            id: id,
            isStatusOn: isStatusOn,
        };

        $http.put('http://localhost:8080/rooms/' + id.toString(), JSON.stringify(data)).then(function (response) {

            if (response.data)
                $scope.rooms = response.data;

        },);
    };
});
