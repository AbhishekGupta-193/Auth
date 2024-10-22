# UI Images

## Login Page

![Project Image](https://raw.githubusercontent.com/AbhishekGupta-193/Auth-Frontend/refs/heads/main/src/assets/loginPage.png
)
## Signup Page

![Project Image](https://raw.githubusercontent.com/AbhishekGupta-193/Auth-Frontend/refs/heads/main/src/assets/signupPage.png
)
## Dashboard Page

![Project Image](https://raw.githubusercontent.com/AbhishekGupta-193/Auth-Frontend/refs/heads/main/src/assets/dashboardPage.png
) 


# API Endpoints

## Register User

POST : http://localhost:8080/auth/registerUser
BODY : 
    {
        "mobileNo": "9876543212",
        "name": "Rahul Gupta"
        "password":"345678"
    }


## Login User

POST : http://localhost:8080/auth/loginUser
BODY :
{
    "mobileNo":"5432109876"
    "password":"345678"
}


## Get All User Details

GET : http://localhost:8080/auth/getUsers


