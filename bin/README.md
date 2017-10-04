# SimpliTest
This is the test repository for Simplifia applying for Java dev positions.

# Project presentation
This project is a Proof Of Concept (POC) about a pipeline of inputs validation, transformation and export.
It deals with input according to a Locale and is expected to proceed to custom data processing according to this locale.

# Main classes
- LocaleExtractor => reads an input and determines the Locale associated (E.G : 'fr' ->Locale.FRENCH)
- SmpInputValidator => specify a pattern of validation according to a Locale
- SmpDataTransformer => transforms an input to add its own content
- SmpOutputWriter => sends a content to the correct

# Task description
Your task will be to implement this chain for the locale ENGLISH (user input 'en').
The program shall :
- rejects any input containing the characters 'é','ê' and 'è'
- transforms the input to add " : Welcome to Simplifia!"
- prints the input to standard output

The previous developer has started some unit tests, but he did not fulfilled them all.
It is expected for you to complete the project's test coverage.

Some uses Mockito as a means to verify interactions
Below is a comprehensive example using Mockito
http://www.vogella.com/tutorials/Mockito/article.html

# How to
It is strongly advised to use Intellij Community Edition since Maven is embedded to build the jar.
The jar is runnable since the main class is specified in the manifest.
The Main class is runnable with your IDE, feel free to use it.

After cloning this repository,
create your branch with your name in the branch name:
git checkout -b topic/test-{YOUR_NAME}
Please commit every 30 minutes so we can see your velocity

After pushing your branch, please add florian.schmidt@simplifia.fr as reviewer.
