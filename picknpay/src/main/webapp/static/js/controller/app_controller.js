'use strict';

angular.module('myApp').controller('appctrl',["$scope", "httpService","$location","$window",function($scope,httpService,$location,$window){
	
	/*To Validate the User ddddddddddddd*/
	 $scope.validateuser=function(){
		var email=$scope.emailAddress;
		var pass=$scope.password;
	var formdata={
				emailAddress:email,
				password:pass
				
		};
		var details={
				
				getUrl:"rest/isvalid",
				getFormData:formdata
				
		};
		
		httpService.getDataByForm(details).then(onSuccessRetrival, onError);
	 };
		
		var onSuccessRetrival = function(data) {
                    
                        alert("User Logged in Successfully");
			$window.localStorage.setItem("email",data.emailAddress);
			$scope.logged=data.emailAddress;
			console.log($scope.logged);			
			$location.path('/Home');
			///////$scope.getArticleDetails();
			
		};
		
		var onError = function(reason) {
			alert("Invalid Login");
			
		};
		
                
                /*
                 
                 /*To Validate the Admin*/
	 $scope.validateAdmin=function(){
		var email=$scope.emailAdmin;
		var pass=$scope.passwordAdmin;
	var formdata={
				emailAddress:email,
				password:pass
				
		};
		var details={
				
				getUrl:"rest/isAdminvalid",
				getFormData:formdata
				
		};
		
		httpService.getDataByForm(details).then(onSuccessRetrivalAdmin, onErrorAdmin);
	 };
		
		var onSuccessRetrivalAdmin = function(data) {
                    
                        alert("Admin Logged in Successfully");
			$location.path('/additems');
			//$scope.getArticleDetails();
			
		};
		
		var onErrorAdmin = function(reason) {
			alert("Invalid Login");
                        $location.path('listitems');
			
		};
		 
                                 
		/*To add the User*/
		
		$scope.createUser = function(){
         
                        
                        var userID=$scope.userID;
			var firstName=$scope.firstName;
			var lastName=$scope.lastName;
                        var emailAddress=$scope.emailAddress;
			var password=$scope.password;
                      
		var formdata={
				"userID":userID,
                                "firstName":firstName,
				"lastName":lastName,
                                "emailAddress":emailAddress,
				"password":password
                                
						
			};
                       
			var details={
					
					getUrl:"rest/createUser",
					getFormData:formdata
					
			};
			
			httpService.getDataByForm(details).then(onSuccessRetrivals, onErrorUser);
		 };
		 var onErrorUser = function(reason) {
				alert("User is not added");
				
			};
			
			var onSuccessRetrivals = function(data) {
			alert("User Added SuccessFully");
			$location.path('/Home');
			};
                        
                       
                        
                        /*To add the Product*/
               $scope.addProduct = function () {


                        var ProductName = $scope.ProductName;
                        var ProductDescription = $scope.ProductDescription;
                        var ProductBrand = $scope.ProductBrand;
                        var ProductPrice = $scope.ProductPrice;
                        var ProductCategory = $scope.ProductCategory;
                        var ProductImageUrl = $scope.ProductImageUrl;

                        var formdata = {

                            "ProductName":ProductName,
                            "ProductDescription":ProductDescription,
                            "ProductBrand":ProductBrand,
                            "ProductPrice":ProductPrice,
                            "ProductCategory":ProductCategory,
                            "ProductImageUrl":ProductImageUrl


                        };
            alert(ProductName + " " + ProductDescription + " " + ProductBrand + " " + ProductPrice + " " + ProductCategory + " " + ProductImageUrl);

            var details = {

                getUrl: "rest/addProduct",
                getFormData: formdata

            };

            httpService.getDataByForm(details).then(onSuccessRetrivalsproduct, onErrorUserproduct);
        };
        var onErrorUserproduct = function (reasons) {
            alert("Product is not added");

        };

        var onSuccessRetrivalsproduct = function (datas) {
            alert("Product is Added");
            $location.path('/AdminLogin');
        };
			                    
			
			/*endddddddddddddddddddd*/                       
                        
                 //get ProductID
            $scope.getProductId= function () {
                
                var ProductName=$scope.ProductName;
                
            var formdata = {
                "ProductName":ProductName
            };
            alert(ProductName);
            var details = {

                getUrl: "rest/getProductId",
                getFormData: formdata

            };

            httpService.getDataByForm(details).then(successarta, artfailurea);
        };

        var successarta = function successCallback(data) {
            alert('Fetched user Successfully');
            $scope.ProductList = data;

        };

        var artfailurea = function errorCallback(reason) {
            //alert('Not Able to Fetch ProductID');
        };

/*
        $scope.getProductDetails();
        /*To show article content*/
       /* $scope.userClick = function (item) {
            $scope.content = item.lastName;

        };*/


         //get users//
            $scope.getProductInfomation = function(){
                 var formdata = {
              "userEmail":$window.localStorage.getItem("userEmail")
        };
                var details = {

                getUrl:"rest/getProductsInfo",
                getFormData:formdata

        };
        httpService.getDataByForm(details).then(successInfo, infofailure);
        };
        var successInfo = function successCallback(data) {
             
        
                $scope.ProductInfoList = data;
        };
        var infofailure = function errorCallback(reason) {
              alert('Not Able to Fetch product???');
        };
        
        $scope.carts=[]; 
          
      	$scope.addcart = function(product){
            var exist=false;
            for(var i=0; i < $scope.carts.length;i++){
                if($scope.carts[i].productName===product.productName)
                {
                   exist=true; 
                    
                }
            }
            if(!exist){
                  $scope.carts.push({productName: product.productName, 
                                   productBrand: product.productBrand, 
                                   productPrice:product.productPrice,
                                   productQuantity:product.productQuantity});
                           }
                           
              };
              
           
        
        /*Removing Quantity*/
        $scope.addquantity = function(product){
            var exist=false;
            for(var i=0; i < $scope.carts.length;i++){
                if($scope.carts[i].productName===product.productName)                {                   
                    $scope.carts[i].productQuantity=parseInt($scope.carts[i].productQuantity)+1;
                   
                         exist=true;
                }
            }                      
	};
        
        /*Removing Quantity*/
        $scope.removequantity = function(product){
            var exist=false;
            for(var i=0; i < $scope.carts.length;i++){
                if($scope.carts[i].productName===product.productName)
                {      if($scope.carts[i].productQuantity>0){             
                    $scope.carts[i].productQuantity=parseInt($scope.carts[i].productQuantity)-1;
                         exist=true;
                     };
                }
            }                      
	};
                
                       
        
        
        $scope.removecart = function(cart){
            if(cart){
            $scope.carts.splice($scope.carts.indexOf(cart), 1);
            $scope.total -= cart.productPrice;
             $scope.count =$scope.count - 1;
            }
	};
        
           $scope.total = 0;
	   
                
            $scope.setTotals = function(){
               
                angular.forEach($scope.carts,function(cart)
                {
                    total+=cart.productQuantity * cart.productPrice;
                });
                return total;
		/*if(cart){
                    $scope.total += cart.productPrice;
                   
		}*/
	} ;    
        
                 
	
      /* var cart = {
	item: "Product 1",
	price: 35.50,
	qty: 2
        };
        var jsonStr = JSON.stringify( cart );
        sessionStorage.setItem( "cart", jsonStr );
        // now the cart is {"item":"Product 1","price":35.50,"qty":2}
        var cartValue = sessionStorage.getItem( "cart" );
        var cartObj = JSON.parse( cartValue );
        // original object*/
       
       
        }
    
]);


	
			
		
		
	
