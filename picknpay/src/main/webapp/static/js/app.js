'use strict';
 
var myApp = angular.module('myApp',['ngRoute']);
myApp.config(function($routeProvider,$httpProvider,$locationProvider){
    
	$routeProvider.when("/register",{
		templateUrl:"view/register.html",
		controller:"appctrl"
		
		
	}).when("/Home",{
	

		templateUrl:"view/Home.html",
                controller:"appctrl"
                        
	}).when("/listitems",{
	

		templateUrl:"view/listitems.html",
		controller:"appctrl"
                
	}).when("/login",{
	
		templateUrl:"view/login.html",
		controller:"appctrl"
                
	}).when("/additems",{
	
		templateUrl:"view/additems.html",
		controller:"appctrl"
                
	}).when("/AdminLogin",{
	
		templateUrl:"view/AdminLogin.html",
		controller:"appctrl"
                
	}).when("/AddToCart",{
	
		templateUrl:"view/AddToCart.html",
		controller:"appctrl"
                
	}).otherwise({
		redirectTo : "/Home"
	});
	
});