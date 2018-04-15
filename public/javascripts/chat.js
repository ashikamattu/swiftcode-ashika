var app = angular.module('chatApp', ['ngMaterial']);

app.config(function ($mdThemingProvider) {
        $mdThemingProvider.theme('default')
            .primaryPalette('purple')
            .accentPalette('blue');
    }

);
app.controller('chatController', function ($scope) {
    $scope.messages = [
        {
            'sender': 'USER',
            'text': 'Hello'
        },
        {
            'sender': 'BOT',
            'text': 'Hi what an i do for you?'
        },
        {
            'sender': 'USER',
            'text': 'Order Pizza for me'
        },
        {
            'sender': 'BOT',
            'text': 'Give money'
        }

    ];

});