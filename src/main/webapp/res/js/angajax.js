angular.module('demo', [])
.controller('Hello', function($scope, $http) {
    $http.get('/fuck/gimme').
        then(function(response) {
            $scope.resdata = response.data;
        });
});