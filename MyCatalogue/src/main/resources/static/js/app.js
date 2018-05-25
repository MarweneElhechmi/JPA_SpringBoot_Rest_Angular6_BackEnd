angular.module('MyCatalogue')
 .service('MyCatalogueService', ['$http',MyCatalogueService]);

function MyCatalogueService($http){
	var url = "/all";
	
	this.getAllProduits=function(){
		return $http.get(url);
	};
	
	angular.module('MyCatalogue')
	 .controller('MyCatalogueController', MyCatalogueController);
	MyCatalogueController.$inject=['http','MyCatalogueService'];
	
	function MyCatalogueController($http,MyCatalogueService){
	
	var vm = this;
	
	MyCatalogueService.getAllProduits.then(function (data) 
			{
		
		vm.produits = data;
			})
}
}