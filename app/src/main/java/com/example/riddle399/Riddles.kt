package com.example.riddle399

import kotlin.collections.ArrayList

class Riddles {

    fun getLoveRiddles(): ArrayList<RiddleItem> {

        val loveRiddles = ArrayList<RiddleItem>()

        loveRiddles.add(RiddleItem(
            "Why did Carbon marry Hydrogen?",
            "The bonded so well"
        ))
        loveRiddles.add(RiddleItem(
            "What did the man with a broken leg say to his nurse?",
            "I have a crutch on you"
        ))

        loveRiddles.add(RiddleItem(
            "What did the sculpture say to his girlfriend?",
            "I love you with all my art"
        ))

        loveRiddles.add(RiddleItem(
            "What happened when the man realized he was in love with his garden?",
            "He wed his plants"
        ))

        loveRiddles.add(RiddleItem(
            "What did the paperclip say to the magnet?",
            "You are very attractive"
        ))

        return loveRiddles
    }

    fun getMoneyRiddles(): ArrayList<RiddleItem> {

        val moneyRiddles = ArrayList<RiddleItem>()

        moneyRiddles.add(RiddleItem(
            "If money really did grow on trees, what would be everyone’s favorite season?",
            "Fall"
        ))
        moneyRiddles.add(RiddleItem(
            "Why was the basketball player in trouble with the bank?",
            "He kept bouncing checks"
        ))

        moneyRiddles.add(RiddleItem(
            "What has one hundred heads and one hundred tails?",
            "One hundred pennies"
        ))

        moneyRiddles.add(RiddleItem(
            "Where can you find money whenever you look for it?",
            "In the dictionary"
        ))

        moneyRiddles.add(RiddleItem(
            "What is the easiest way to double your money?",
            "Put it in front of a mirror"
        ))


        return moneyRiddles
    }

    fun getScienceRiddles(): ArrayList<RiddleItem> {

        val scienceRiddles = ArrayList<RiddleItem>()

        scienceRiddles.add(RiddleItem(
            "Many have heard it, but nobody has ever seen it. It will not speak back until spoken to. What is it?",
            "An echo"
        ))
        scienceRiddles.add(RiddleItem(
            "What is black when you buy it, red when you use it and gray when you throw it away?",
            "Charcoal"
        ))

        scienceRiddles.add(RiddleItem(
            "Which is heavier, a pound of bricks or a pound of feathers?",
            "They both weigh one pound"
        ))

        scienceRiddles.add(RiddleItem(
            "Did you hear the one about a chemist who was reading a book about helium?",
            "He couldn’t put it down"
        ))

        scienceRiddles.add(RiddleItem(
            "When the son of the water returns to the parent, it dies. What is it?",
            "Ice"
        ))


        return scienceRiddles
    }

    fun getSportsRiddles(): ArrayList<RiddleItem> {

        val sportsRiddles = ArrayList<RiddleItem>()

        sportsRiddles.add(RiddleItem(
            "What sport has four letters, is played all around the world, and begins with a T?",
            "Golf"
        ))
        sportsRiddles.add(RiddleItem(
            "How did the baseball fan know before the game that the score would be 0-0?",
            "The score is always 0-0 before a game"
        ))

        sportsRiddles.add(RiddleItem(
            "What is the difference between a dog and a basketball player?",
            "One drools, the other dribbles"
        ))

        sportsRiddles.add(RiddleItem(
            "What do hockey players and magicians have in common?",
            "Both can do hat tricks"
        ))

        sportsRiddles.add(RiddleItem(
            "What do you call a sheep that practices karate?",
            "Lamb chop"
        ))



        return sportsRiddles
    }

    fun getTimeRiddles(): ArrayList<RiddleItem> {

        val timeRiddles = ArrayList<RiddleItem>()

        timeRiddles.add(RiddleItem(
            "I can bring tears to your eyes; resurrect the dead, make you smile, and reverse time. I form in an instant but I last a life time. What am I?",
            "A memory"
        ))
        timeRiddles.add(RiddleItem(
            "What time is spelled the same forwards and backwards?",
            "Noon"
        ))

        timeRiddles.add(RiddleItem(
            "What is at the beginning of the end, the start of eternity, at the end of time and space, was in the middle of yesterday but is nowhere in tomorrow?",
            "The letter “E”"
        ))

        timeRiddles.add(RiddleItem(
            "It’s a question you can ask all day long and get completely different but correct answers. What is the question?",
            "What time is it?"
        ))

        timeRiddles.add(RiddleItem(
            "Two people are born at the same time, but they don’t have the same birthdays. How could this be?",
            "They were born in different time zones on different days"
        ))


        return timeRiddles
    }

    fun getAllRiddles(): ArrayList<RiddleItem> {

        val allRiddles = ArrayList<RiddleItem>()

        allRiddles.addAll(getLoveRiddles())
        allRiddles.addAll(getMoneyRiddles())
        allRiddles.addAll(getTimeRiddles())
        allRiddles.addAll(getScienceRiddles())
        allRiddles.addAll(getSportsRiddles())

        return allRiddles
    }

}