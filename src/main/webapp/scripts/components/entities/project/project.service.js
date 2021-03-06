'use strict';

angular.module('sejourApp')
    .factory('Project', function ($resource, DateUtils) {
        return $resource('api/projects/:id', {}, {
            'query': { method: 'GET', isArray: true},
            'get': {
                method: 'GET',
                transformResponse: function (data) {
                    data = angular.fromJson(data);
                    data.comingDate = DateUtils.convertDateTimeFromServer(data.comingDate);
                    data.trainingStart = DateUtils.convertDateTimeFromServer(data.trainingStart);
                    return data;
                }
            },
            'update': { method:'PUT' }
        });
    });
