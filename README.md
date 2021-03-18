# amazon-lex-gcp-diaglogflow-abstraction
on simply put: ALGDA :)

In this project I try to abstract the use of amazon lex first, but then also google's dialog flow.
Why?
Becuase vendor locking is never a good idea, and because I think it can be convient to put your bot instructions in your source code and be able to version control it

How?
I am planning on using a yml with some intents and maybe also allow to referece to functions that will be used as lambda functions

The project attempts to reconstruct how you would normally work with chatbot so that more elaborate boilerplate cases like cascaded conversations with contexts are easier to produce and maintain

TODO:
- Define format accuratley
- Bot creation
- Support lambda functions
- Add gcp support
- Write better docs