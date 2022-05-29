angular.module('market').controller('registerController', function ($scope, $http) {
    $scope.register = function() {
         $http.post('http://localhost:5555/auth/api/v1/registers');
    };
});
