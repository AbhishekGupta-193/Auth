## API Endpoints

# Register User

POST : http://localhost:8080/auth/registerUser
BODY : 
    {
        "mobileNo": "9876543212",
        "name": "Rahul Gupta"
    }


# Login User

POST : http://localhost:8080/auth/loginUser
BODY :
{
    "mobileNo":"5432109876"
}


#Get All User Details

GET : http://localhost:8080/auth/getUsers

