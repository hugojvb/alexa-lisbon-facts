package com.alexaskill.jokes;

public class Jokes {

    private static final String[] jokes = {
            "When you eat a lot of spicy food, you can lose your taste. When I was in India last summer, I was listening to a lot of Michael Bolton.",
            "My favourite road sign is ‘Falling Rocks’. What exactly am I supposed to do with that information? They may as well have a sign saying, ‘Random accidents ahead’; ‘Life’s a lottery, Be lucky.'",
            "I realised I was dyslexic when I went to a toga party dressed as a goat.",
            "When I was a kid, I used to have an imaginary friend. I thought he went everywhere with me. I could talk to him and he could hear me, and he could grant me wishes and stuff too. But then I grew up, and stopped going to church.",
            "Swimming is good for you, especially if you’re drowning. Not only do you get a cardio workout, but you also don’t die.",
            "Recently my girlfriend asked me if I was having sex behind her back and I replied, ‘Yes, who did you think it was?'",
            "I saw a charity appeal in The Guardian the other day, and it read, ‘Little Zuki has to walk 13 miles a day just to fetch water.’ And I couldn’t help thinking, ‘she should move.'",
            "Saying that you don’t believe in magic but do believe in God is a bit like saying you don’t have sex with dogs, except Labradors.",
            "I did a gig in the US once for the homeless. I said, ‘It’s nice to see so many bums on seats.'",
            "Remember to never answer a phone during sex, even if you hilariously answer with, ‘I can’t talk now, I’m going into a tunnel.'",
            "Viagra has instructions: ‘Keep away from children’ – what kind of man do you think I am?",
            "I was walking the streets of Glasgow the other week and I saw this sign, ‘This door is alarmed’. I said to myself, ‘How do you think I feel?'",
            "There was one time where I failed to perform sexually. My girlfriend said to me, ‘oh, don’t worry, it happens to a lot of guys.’ OK, there are two things wrong with that. First of all who are these other guys? And second of all if it’s happening to more than one of us, don’t you think it could be your fault?",
            "My girlfriend bought a cookbook the other day called Cheap and Easy Vegetarian Cooking. Which is perfect for her, because not only is she vegetarian…",
            "My girlfriend said she wanted me to tease her, so I said, ‘Alright, fatty.'",
            "Throwing acid is wrong. In some people’s eyes.",
            "A lady with a clipboard stopped me in the street and said ‘Can you spare a few minutes for cancer research?’ I said, ‘alright, but we’re not going to get much done.'",
            "When someone close to you dies, move seats.",
            "I live near a special needs school. There’s a sign that says, ‘slow – children’. That can’t be good for their self esteem. But look of course on the positive side… they can’t read it.",
            "I saw that show 50 Things To Do Before You Die. I’d have thought the obvious one was, ‘shout for help.'",
            "The American police have said they will never forget 9/11. Pretty hard to, I would think, considering it’s your phone number.",
            "Ten years after the Chernobyl accident, and am I the only one that’s disappointed? Still no superheroes.",
            "Boxers don’t have sex before a fight. Do you know why that is? They don’t fancy each other.",
            "David Cameron says he’ll put a cap on immigrants coming into the UK. That’s wrong. Immigrants should be allowed to wear what they like.",
            "The reason old men use Viagra is not that they are impotent. It’s that old women are so very ugly.",
            "I’m not sure if you’re aware of this, but if you took all the money that we in the West spend on food in one week, you could feed the Third World for a year. I’m not sure about you, but I think we’re being overcharged on groceries.",
            "My Mum told me the best time to ask my Dad for anything was during sex. Not the best advice I’d ever been given. I burst in through the bedroom door saying, ‘Can I have a new bike?’ He was very upset. His secretary was surprisingly nice about it. I got the bike.",
            "I just don’t understand it: Why would you become an Islamic fundamentalist suicide bomber on the off chance you might get 72 virgins when you die? Become a Catholic priest and have them now!",
            "Childhood is now effectively over by 11, which is when the pubs close and Uncle Terry comes home.",
            "A lot of people like to smoke cigarettes after sex, but you can’t buy cigarettes until you’re 16 so I have to buy them for both of us.",
            "My girlfriend likes to have the lights on during sex. She likes to be able to read, which I think is to be encouraged in a girl of her age. I’m kidding. She’s actually scared of the dark.",
            "Having sex with someone at work is alright as long as you don’t work in a primary school.",
            "My Catholic priest told me when I was twelve years of age, ‘God is watching you masturbate,’ and I asked, ‘Is he a pedophile too, father?’",
            "My girlfriend can be really loud during sex. I don’t know why—she knows no one’s coming to help.",
            "I said to my girlfriend, do you want to role play with a rape fantasy? She said ‘No!’ and I said, ‘That’s the spirit.’",
            "‘Rape’ is such a horrible word, though, it’s such a harsh brutal word. That’s why I prefer to call it a ‘Struggle Snuggle.’",
            "Of course, the big question, at the moment, globally, is ‘Should gay men be allowed to get married?’ And I’m a liberal. I say yes, as long as they find the right woman. I could have been gay. I failed the oral. Don’t neglect the balls. There’s a lesson.",
            "Because of political correctness, you’re not meant to say ‘air hostess’ any more, are you? You’re meant to say, if it’s a woman, ‘sky waitress’, and if it’s a man, ‘homosexual.’ Doesn’t really change anything.",
            "My girlfriend recently had a miscarriage…and it was doubly bad because I had to pay for it.",
            "If only Africa had more mosquito nets, then every year we could save millions of mosquitoes from dying needlessly of AIDS.",
            "If you’re going to have sex with a stranger …. always, always, always ask.",
            "Women reach their sexual peak after 35 years; men reach theirs after about four minutes.",
            "I went to see a hypnotist the other night and I really enjoyed myself, which made me suspicious…",
            "I was filling out a questionnaire that said, “Who would you most like to sleep with – anyone living or dead?” I said “Anyone living.",
            "A nurse finds a rectal thermometer in her front pocket. Well, Some Assholes got my pen",
            "Dwarves... are often overlooked. Tell you what I know about dwarves... very little. I can say that, they look up to me.",
            "I got talking to a native African girl, for hours, we just... clicked.",
            "My girlfriend and I just recently had a sincere conversation about pornography, and some of you may share her sentiment, she said 'I don't get porn. I've never got porn. Why would I wanna watch two people have sex?' I said, 'Two? People?You've lost me there...'",
            "I don't like to spend too much time with my girlfriend's family, because her husband is getting suspicious.",
            "My wife always complains when I use her toothbrush? If somebody can tell me of a better way of getting shit stains off the back of the toilet bowl I'm all ears.",
            "Why do so many children die in school shootings? Because they are not allowed to run in the hallway.",
            "A friend of mine got caught masturbating in the showers. That ruined our trip to Auschwitz",
            "Trump ran on wanting to build a wall. And I think that’s his one good idea, because walls work. It’s irrefutable.I was in China last year. I didn’t see one Mexican.",
            "My son got kicked out of school for letting a girl jerk him off in class.That's three schools now. Maybe teaching isn't for him.",
            "It's difficult to date when you have OCD. Every time my girlfriend gets turned on, I turn her off again.",
            "If you want to get a girl's attention, just compliment them. Like: Wow! You're a fast runner. Almost got away!",
            "I saw an old woman on the news who's house was flooded. She was standing there, knee deep in water, crying......and I thought that's not helping",
            "My ex wife's star sign was Cancer, quite ironic considering how she died... Eaten by a giant crab",
            "It's very easy to distract a fat person... it's a piece of cake!!!",
            "I saw a travesty wearing a mini skirt, and I thought... That shows a lot of balls.",
            "How can you tell if a girl is too young for you? You need to make the airplane sound to put your cock in her mouth.",
            "I was walking down the street with my wife... when I saw my mother-in-law being beaten up by six men. My wife said, aren't you going to help? I said, Six should be enough.",
            "Backseat drivers are all the same...With the whole.. Nooo.. Why are we going into the woods.",
            "Adolf Hitler has been judged very harshly by history however... he did kill one of the most dangerous men in history, himself.",
            "I went in to donate a kidney once but when I arrived at the hospital they asked me where I'd got it from"
    };

    public static String[] getJokes() {
        return jokes;
    }

    public static int getCount(String[] jokes) {
        return jokes.length;
    }
}