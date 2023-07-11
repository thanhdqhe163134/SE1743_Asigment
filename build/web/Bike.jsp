<%@ page import="java.util.List" %>
<%@ page import="models.Bike" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
   <!-- basic -->
   <meta charset="utf-8">
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1">
   <!-- site metas -->
   <title>Bike List</title>
   <meta name="keywords" content="">
   <meta name="description" content="">
   <meta name="author" content="">
   <!-- bootstrap css -->
   <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
   <!-- style css -->
   <link rel="stylesheet" type="text/css" href="css/style.css">
   <!-- Responsive-->
   <link rel="stylesheet" href="css/responsive.css">
   <!-- fevicon -->
   <link rel="icon" href="images/fevicon.png" type="image/gif" />
   <!-- Scrollbar Custom CSS -->
   <link rel="stylesheet" href="css/jquery.mCustomScrollbar.min.css">
   <!-- Tweaks for older IEs-->
   <link rel="stylesheet" href="https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">
   <!-- owl stylesheets -->
   <link href="https://fonts.googleapis.com/css?family=Poppins:400,700|Raleway:400,700,800&display=swap" rel="stylesheet">
   <link rel="stylesheet" href="css/owl.carousel.min.css">
   <link rel="stylesoeet" href="css/owl.theme.default.min.css">
   <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css" media="screen">
   <style>
      /* Custom styles for Bike List page */
      .bike_list_section {
         background-color: #000;
      }

      .bike_list_taital,
      .bike_list_text {
         color: #fff;
      }

      .bike_item {
         background-color: #333;
         color: #fff;
         padding: 20px;
         margin-bottom: 20px;
         border-radius: 5px;
      }

      .bike_name {
         font-size: 24px;
         font-weight: bold;
         margin-bottom: 10px;
      }

      .bike_type {
         font-size: 16px;
         margin-bottom: 10px;
      }

      .bike_description {
         margin-bottom: 10px;
      }

      .bike_menu {
         margin-bottom: 20px;
      }

      .bike_menu select {
         padding: 10px;
      }
   </style>
   <!-- Your custom styles -->
   <style>
      .logo {
         width: 50px;
         height: auto;
      }

      body {
         background-color: #000;
         color: #fff;
      }

      .header_section {
         background-color: #c00;
      }

      .navbar-light .navbar-toggler {
         border-color: #fff;
      }

      .navbar-toggler-icon {
         background-image: url("data:image/svg+xml,%3csvg xmlns='http://www.w3.org/2000/svg' viewBox='0 0 30 30'%3e%3cpath stroke='rgba(255, 255, 255, 0.8)' stroke-width='2' stroke-linecap='round' stroke-miterlimit='10' d='M4 7h22M4 15h22M4 23h22'/%3e%3c/svg%3e");
      }

      .nav-link,
      .contact_bt a,
      .buy_bt a,
      .read_bt a,
      .subscribe_bt a {
         color: #fff;
      }

      .nav-link:hover,
      .contact_bt a:hover,
      .buy_bt a:hover,
      .read_bt a:hover,
      .subscribe_bt a:hover {
         color: #f7c17b;
      }

      .banner_section {
         background-color: #c00;
      }

      .banner_taital,
      .banner_text {
         color: #fff;
      }

      .cycle_section {
         background-color: #000;
      }

      .cycle_taital,
      .cycle_text {
         color: #fff;
      }

      .cycles_text,
      .lorem_text,
      .buy_bt a,
      .price_text {
         color: #fff;
      }

      .cycles_text {
         color: #c00;
      }

      .cycles_text:hover,
      .buy_bt a:hover,
      .price_text:hover {
         color: #f7c17b;
      }

      .about_section {
         background-color: #000;
      }

      .about_taital,
      .about_text {
         color: #fff;
      }

      .client_section {
         background-color: #000;
      }

      .client_taital,
      .client_text,
      .client_name {
         color: #fff;
      }

      .news_section {
         background-color: #000;
      }

      .news_taital,
      .news_text,
      .speed_text,
      .post_text,
      .long_text {
         color: #fff;
      }

      .contact_section {
         background-color: #000;
      }

      .request_text,
      .email-bt,
      .massage-bt,
      .send_btn a {
         color: #fff;
      }

      .footer_section {
         background-color: #c00;
      }

      .call_text,
      .email_text,
      .subscribe_bt a {
         color: #fff;
      }

      .call_text a:hover {
         color: #f7c17b;
      }

      .map-responsive iframe {
         border: 2px solid #fff;
      }

      .copyright_text {
         color: #fff;
      }

      .social_icon li a {
         color: #fff;
      }

      .social_icon li a:hover {
         color: #f7c17b;
      }

      .banner_section .container .row .col-md-6 {
         width: 100%;
         height: 100%;
      }

      .banner_section .container .row .col-md-6 img {
         width: 100%;
         height: 100%;
         object-fit: cover;
      }
      
      /* Màu chữ cho menu */
      .navbar-nav .nav-link {
         color: #000000 !important;
      }

      /* Màu chữ khi hover trên menu */
      .navbar-nav .nav-link:hover {
         color: #000000 !important;
      }
   </style>
</head>
<body>
   <!-- header section start -->
   <div class="header_section header_bg">
      <!-- header content -->
   </div>
   <!-- header section end -->

   <!-- bike list section start -->
   <div class="bike_list_section layout_padding">
      <div class="container">
         <h1 class="bike_list_taital">Bike List</h1>
         <div class="bike_menu">
            <select id="bike_type_select">
               <option value="all">All</option>
               <option value="Sport">Sport</option>
               <option value="Naked">Naked</option>
               <option value="Cruiser">Cruiser</option>
               <option value="Adventure">Adventure</option>
            </select>
         </div>
         <div class="bike_list_text" id="bike_list">
            <!-- Bike list will be dynamically populated here -->
            <% 
               List<Bike> bikeList = (List<Bike>) request.getAttribute("bikeList");
               if (bikeList != null && !bikeList.isEmpty()) {
                  for (Bike bike : bikeList) {
            %>
            <div class="bike_item">
               <h2 class="bike_name"><%= bike.getName() %></h2>
               <p class="bike_type"><%= bike.getType() %></p>
               <p class="bike_description"><%= bike.getDescription() %></p>
            </div>
            <% 
                  }
               } else {
            %>
            <p>No bikes found.</p>
            <% 
               }
            %>
         </div>
      </div>
   </div>
   <!-- bike list section end -->

   <!-- footer section start -->
   <div class="footer_section layout_padding">
      <!-- footer content -->
   </div>
   <!-- footer section end -->

   <!-- jquery -->
   <script src="js/jquery.min.js"></script>
   <!-- bootstrap -->
   <script src="js/bootstrap.bundle.min.js"></script>
   <!-- owl carousel -->
   <script src="js/owl.carousel.min.js"></script>
   <!-- custom -->
   <script src="js/custom.js"></script>

  <script>
   // Function to get bike list based on selected type
   function getBikeList(type) {
      // Make an AJAX request to get bike list from the server/database
      // Replace this code with your actual implementation to fetch data from the database
      // You can use any server-side technology such as PHP, Node.js, etc.

      // Here, we are mocking the response with a hardcoded data array
      var bikeData = [
         <% for (int i = 0; i < bikeList.size(); i++) { %>
            {
               name: "<%= bikeList.get(i).getName() %>",
               type: "<%= bikeList.get(i).getType() %>"
            }<%= (i != bikeList.size() - 1) ? ',' : '' %>
         <% } %>
      ];

      // Filter the bike list based on the selected type
      var filteredBikeList = bikeData.filter(function(bike) {
         return (type === 'all' || bike.type.toLowerCase() === type.toLowerCase());
      });

      // Clear the existing bike list
      document.getElementById("bike_list").innerHTML = "";

      // Create and append the bike items to the bike list section
      for (var i = 0; i < filteredBikeList.length; i++) {
         var bike = filteredBikeList[i];
         var bikeItem = document.createElement("div");
         bikeItem.classList.add("bike_item");

         var bikeName = document.createElement("h2");
         bikeName.classList.add("bike_name");
         bikeName.innerHTML = bike.name;

         var bikeType = document.createElement("p");
         bikeType.classList.add("bike_type");
         bikeType.innerHTML = bike.type;

         bikeItem.appendChild(bikeName);
         bikeItem.appendChild(bikeType);

         document.getElementById("bike_list").appendChild(bikeItem);
      }
   }

   // Event listener for bike type selection
   document.getElementById("bike_type_select").addEventListener("change", function() {
      var selectedType = this.value;
      getBikeList(selectedType);
   });

   // Initial call to populate the bike list with all types
   getBikeList("all");
</script>

</body>
</html>
