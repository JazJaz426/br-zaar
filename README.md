
## Project Details
- **Project name:** Br-Zaar
- **Team Members:**
  - Jazlyn Lin (jlin223)
  - Xinyang Cai (cxinyang)
  - Zhinuo Wang (zwang571)
- **Total Estimated Time:** 100 hours
- **Repo Link:** [GitHub](https://github.com/cs0320-s24/term-project-candice-novia-jaz)

![Screenshot 2024-05-29 at 8 51 58 pm](https://github.com/JazJaz426/br-zaar/assets/46860162/d0a3668d-64b4-4f0d-834c-b87cc5c67b5a)

## Purpose:
Bearzaar aims to provide a user-friendly, efficient, and secure platform for trading second-hand goods within the Brown University community. It addresses the inefficiencies of current platforms by offering a streamlined user experience with enhanced features like real-time notifications, a clean interface, and user verification through Brown email addresses.

## Intended Audience:
The primary users are Brown University students interested in a sustainable and cost-effective way to buy and sell goods. The platform is designed for personal use with varying frequencies of engagement, from daily to occasional use.

## Scope and User Stories:
Bearzaar will focus on essential functionalities to facilitate the buying and selling process while ensuring user security and a pleasant user experience. 

Key features include:
- Posting Items: Users can post items for sale
- Browsing and Viewing Items: A catalog of available goods will be displayed, with detailed views available for each item.
- Searching and Watching Items: Users can search for items and add them to a watch list to receive notifications.
- Claiming Items: Items can be claimed to update their status in real-time, preventing others from claiming the same item.
- Discovering Items: Personalized item recommendations can be viewed in the discover page.

## Design Choices:
- Frontend: Utilizes React for a responsive and intuitive user interface.
- Backend: Java is used for server-side logic, handling API endpoints, and interacting with the Firestore database.
- Database: Firestore is chosen for its scalability and real-time data syncing capabilities.
- Authentication: Integration with Brown University's authentication system or Firebase Authentication to manage user logins securely.

## How to:

### Starting the Application

1. **Start the Server:** Navigate to the server/ directory in your terminal and run the following commands to start the server:

```
mvn package
./run

```

2. **Start the Client:** Open a new terminal window, navigate to the client/ directory, and run:

```
npm install
npm start
```

3. Go to [localhost:8000](http://localhost:8000/) and click Sign in With Google to sign in with your brown edu Google account and now you can access the BZaar through your web browser.
