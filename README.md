## Inspiration

Communication is essential in many contexts, and one of the beautiful things about it is the many methods that humans, animals, and even cells use to communicate. Our project was inspired by how AI and machine learning can aid education and communication. Sign language is an incredibly useful tool used by more than 72 million people worldwide (National Geographic, 2023). We were inspired by other learning apps and tools to create a similar model using AI to aid in teaching and translating sign language in real time using the AI software. There are many ways to learn new languages, but our project’s goal was to make it as interactive and engaging as possible to encourage more people to gain a basic grasp of sign language to create a more inclusive and understanding society. We also decided on a chimp mascot since chimpanzees and gorillas are the only animals other than humans to understand sign language.

## Project Purpose

SignChimp teaches ASL and hopefully other popular forms of sign language to the general public through different games, lessons, and life feedback. Through such programs, we can break the language barrier and promote a more inclusive. While such ideas are popular, we aimed to branch out to capture various study techniques, such as retrieval practice, and encourage regularity with the program for steady progress. We created our front-end portion with the goal of making the site as accessible and beginner-friendly as possible. We hope to promote a societal value for life-long learning by creating easy and encouraging learning tools. 

## Build Process

**Collecting Dataset**

We used an original dataset to train our model. Using MATLAB to access the webcam and to collect 300 images for each letter of the alphabet, we stored the images to be used in a later program for model training. The program ‘data_collection_and_processing.m’ contains the code we used to collect the data.

**Training the Model**

We used Convolutional Neural Network (CNN) and particularly AlexNet as our model. After adjusting a few parameters here and there, for example, output size in the fully-connected layers, we fed our dataset into the AlexNet model to classify it. The program ‘modeling.m’ contains the code for training the model.

**Deploying the Model**

After we trained our model, we used it in another MATLAB program, namely ‘app.m’, to detect hand signals in real-time and see if our model could determine the letter from the signal correctly, As long as we place our hand in the ‘Detection Area’, it can accurately detect the letter from the images. 

## Challenges we Faced

One of the challenges we faced was collecting data for our AI software during the hackathon period. Variations in hand positioning and backgrounds were particularly finicky, and we didn’t have time to collect more examples of different lighting or gestures. In real-world implementation, it would take a much larger pool of data to make this tool accessible and inclusive, as a wide range of signing abilities and environmental factors affected MATLAB's ability to detect hand signs. We would also have to consult with a broader audience to gain feedback for creating truly helpful software that can be utilized by people from various backgrounds. 

## What we Learned

Throughout this process, we gained a lot of insight not only into sign language but on the importance of being able to share and communicate across languages. We learned a lot about sign language and its prevalence in the world. We also built upon our website-building and app design skills by creating the interactive interface side. Additionally, this was our first time using MATLAB and deep learning, so we had to learn how to program on MATLAB Online and how the parameters work for AlexNet and Convolutional Neural Networks (CNNs) in general. Since this was our first time in MATLAB, we struggled to integrate the different parts as well, so we'd like to improve this as well. Speaking of improvements... 

## Future SignChimp Plans

In the future, we plan to expand the lessons beyond the alphabet and integrate more memory games and learning tools to encourage people from a wide range of ages to be interested in utilizing SignChimp. We would also love to implement a schedule feature that is similar to other language learning apps to help members with accountability in their learning journeys.
