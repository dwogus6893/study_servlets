<%@ page import="java.util.HashMap, java.util.ArrayList" %>

 <% 
        HashMap<String, String> searchForm = (HashMap<String, String>)request.getAttribute("searchForm"); 
    %>

<%! String url = "location.href='/pollListServerlet'"; %>
    <button class = "btn btn-primary" onclick = "<%= url%> "> Next</button>
    
    <nav class="navbar navbar-expand bg-light">
        <div class="navbar-nav">
            <a href="" class="nav-link">Home</a>
            <a href="" class="nav-link">Feature</a>
            <a href="" class="nav-link">Pricing</a>
        </div>
    </nav>
    <hr>
   