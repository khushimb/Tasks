package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.internal.*;

public class Runner {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.see();
        dog.bark();
        Animal animal = new Animal();
        animal.bark();
        animal.see();
        Animal animal1 = new Dog();
        animal1.bark();
        animal1.see();
        System.out.println("----------------------------------------");

        Vehicle vehicle = new Vehicle();
        vehicle.drive();
        vehicle.park();
        Car car = new Car();
        car.drive();
        car.park();
        Car car1 = new Vehicle();
        car1.drive();
        car1.park();
        System.out.println("----------------------------------------");

        Circle circle = new Circle();
        circle.draw();
        circle.insert();
        Shape shape = new Shape();
        shape.draw();
        shape.insert();
        Shape shape1 = new Circle();
        shape1.draw();
        shape1.insert();
        System.out.println("----------------------------------------");

        Employee employee = new Employee();
        employee.check();
        employee.print();
        Manager manager = new Manager();
        manager.check();
        manager.print();
        Manager manager1 = new Employee();
        manager1.check();
        manager1.print();
        System.out.println("----------------------------------------");

        Pigeon pigeon = new Pigeon();
        pigeon.fly();
        pigeon.eat();
        Bird bird = new Bird();
        bird.eat();
        bird.fly();
        Bird bird1 = new Pigeon();
        bird1.eat();
        bird1.fly();
        System.out.println("----------------------------------------");

        Apple apple = new Apple();
        apple.cut();
        apple.eat();
        Fruit fruit = new Fruit();
        fruit.cut();
        fruit.eat();
        Fruit fruit1 = new Apple();
        fruit1.cut();
        fruit1.eat();
        System.out.println("----------------------------------------");

        Chair chair = new Chair();
        chair.build();
        chair.move();
        Furniture furniture = new Furniture();
        furniture.build();
        furniture.move();
        Furniture furniture1 = new Chair();
        furniture1.build();
        furniture1.move();
        System.out.println("----------------------------------------");

        House house = new House();
        house.build();
        house.destroy();
        Building building = new Building();
        building.build();
        building.destroy();
        Building building1 = new House();
        building1.build();
        building1.destroy();
        System.out.println("----------------------------------------");

        Hammer hammer = new Hammer();
        hammer.open();
        hammer.screw();
        Tool tool = new Tool();
        tool.open();
        tool.screw();
        Tool tool1 = new Hammer();
        tool1.open();
        tool1.screw();
        System.out.println("----------------------------------------");

        Student student = new Student();
        student.dance();
        student.walk();
        Person person = new Person();
        person.dance();
        person.walk();
        Person person1 = new Student();
        person1.dance();
        person1.walk();
        System.out.println("----------------------------------------");

        Plant plant = new Plant();
        plant.dark();
        plant.green();
        Tree tree = new Tree();
        tree.dark();
        tree.green();
        Tree tree1 = new Plant();
        tree1.dark();
        tree1.green();
        System.out.println("----------------------------------------");

        Guitar guitar = new Guitar();
        guitar.play();
        guitar.stop();
        Instrument instrument = new Instrument();
        instrument.play();
        instrument.stop();
        Instrument instrument1 = new Guitar();
        instrument1.play();
        instrument1.stop();
        System.out.println("----------------------------------------");

        Fridge fridge = new Fridge();
        fridge.off();
        fridge.on();
        Appliance appliance = new Appliance();
        appliance.off();
        appliance.on();
        Appliance appliance1= new Fridge();
        appliance1.off();
        appliance1.on();
        System.out.println("----------------------------------------");

        Savingacc savingacc = new Savingacc();
        savingacc.act();
        savingacc.close();
        Account account = new Account();
        account.act();
        account.close();
        Account account1 = new Savingacc();
        account1.act();
        account1.close();
        System.out.println("----------------------------------------");

        Report report = new Report();
        report.edit();
        report.write();
        Document document = new Document();
        document.edit();
        document.write();
        Document document1 = new Report();
        document1.edit();
        document1.write();
        System.out.println("----------------------------------------");

        Teddy teddy = new Teddy();
        teddy.cut();
        teddy.play();
        Toy toy = new Toy();
        toy.cut();
        toy.play();
        Toy toy1 = new Teddy();
        toy1.cut();
        toy1.play();
        System.out.println("----------------------------------------");

        Shirt shirt = new Shirt();
        shirt.tear();
        shirt.wear();
        Cloth cloth = new Cloth();
        cloth.tear();
        cloth.wear();
        Cloth cloth1 = new Shirt();
        cloth1.tear();
        cloth1.wear();
        System.out.println("----------------------------------------");

        Tea tea = new Tea();
        tea.spillTea();
        tea.drinkTea();
        Drink drink = new Drink();
        drink.drinkTea();
        drink.spillTea();
        Drink drink1 = new Tea();
        drink1.drinkTea();
        drink1.spillTea();
        System.out.println("----------------------------------------");

        Dollar dollar = new Dollar();
        dollar.pay();
        dollar.debt();
        Currency currency = new Currency();
        currency.debt();
        currency.pay();
        Currency currency1 = new Dollar();
        currency1.debt();
        currency1.pay();
        System.out.println("----------------------------------------");

        Novel novel = new Novel();
        novel.open();
        novel.read();
        Book book = new Book();
        book.open();
        book.read();
        Book book1 = new Novel();
        book1.open();
        book1.read();
        System.out.println("----------------------------------------");

        Chess chess = new Chess();
        chess.win();
        chess.lose();
        Game game = new Game();
        game.lose();
        game.win();
        Game game1 = new Chess();
        game1.lose();
        game1.win();
        System.out.println("----------------------------------------");

        Python python = new Python();
        python.study();
        python.write();
        Language language = new Language();
        language.study();
        language.write();
        Language language1 = new Python();
        language1.study();
        language1.write();
        System.out.println("----------------------------------------");

        Cricket cricket = new Cricket();
        cricket.bat();
        cricket.ball();
        Sport sport = new Sport();
        sport.ball();
        sport.bat();
        Sport sport1 = new Cricket();
        sport1.ball();
        sport1.bat();
        System.out.println("----------------------------------------");

        Hdfc hdfc = new Hdfc();
        hdfc.close();
        hdfc.open();
        Bank bank = new Bank();
        bank.close();
        bank.open();
        Bank bank1 = new Hdfc();
        bank1.close();
        bank1.open();
        System.out.println("----------------------------------------");

        OperatingSys operatingSys = new OperatingSys();
        operatingSys.run();
        operatingSys.stop();
        Software software = new Software();
        software.run();
        software.stop();
        Software software1 = new OperatingSys();
        software1.run();
        software1.stop();
        System.out.println("----------------------------------------");

        Lan lan = new Lan();
        lan.slow();
        lan.speed();
        Network network = new Network();
        network.slow();
        network.speed();
        Network network1 = new Lan();
        network1.slow();
        network1.speed();
        System.out.println("----------------------------------------");

        User user = new User();
        user.close();
        user.open();
        Admin admin = new Admin();
        admin.close();
        admin.open();
        Admin admin1 = new User();
        admin1.close();
        admin1.open();
        System.out.println("----------------------------------------");

        Tablet tablet = new Tablet();
        tablet.operate();
        tablet.destroy();
        Device device = new Device();
        device.destroy();
        device.operate();
        Device device1 = new Tablet();
        device1.destroy();
        device1.operate();
        System.out.println("----------------------------------------");

        Shark shark = new Shark();
        shark.swim();
        shark.swim1();
        Fish fish = new Fish();
        fish.swim();
        fish.swim1();
        Fish fish1 = new Shark();
        fish1.swim();
        fish1.swim1();
        System.out.println("----------------------------------------");

        Cake cake = new Cake();
        cake.cut();
        cake.eat();
        Dessert dessert = new Dessert();
        dessert.cut();
        dessert.eat();
        Dessert dessert1 = new Cake();
        dessert1.cut();
        dessert1.eat();
        System.out.println("----------------------------------------");

        Rockmusic rockmusic = new Rockmusic();
        rockmusic.play();
        rockmusic.stop();
        Music music = new Music();
        music.play();
        music.stop();
        Music music1 = new Rockmusic();
        music1.play();
        music1.stop();
        System.out.println("----------------------------------------");

        Rose rose = new Rose();
        rose.bloom();
        rose.cute();
        Flower flower = new Flower();
        flower.bloom();
        flower.cute();
        Flower flower1 = new Rose();
        flower1.bloom();
        flower1.cute();
        System.out.println("----------------------------------------");

        Oxygen oxygen = new Oxygen();
        oxygen.method1();
        oxygen.method2();
        Element element = new Element();
        element.method1();
        element.method2();
        Element element1 = new Oxygen();
        element1.method1();
        element1.method2();
        System.out.println("----------------------------------------");

        Color color = new Color();
        color.pink();
        color.green();
        System.out.println("----------------------------------------");

        File file = new File();
        file.close();
        file.open();
        System.out.println("----------------------------------------");

        Message message = new Message();
        message.close();
        message.open();
        System.out.println("----------------------------------------");

        Cat cat = new Cat();
        cat.feed();
        cat.smell();
        Pet pet = new Pet();
        pet.feed();
        pet.smell();
        Pet pet1 = new Cat();
        pet1.feed();
        pet1.smell();
        System.out.println("----------------------------------------");

        HardDisk hardDisk = new HardDisk();
        hardDisk.delete();
        hardDisk.store();
        Storage storage = new Storage();
        storage.delete();
        storage.store();
        Storage storage1 = new HardDisk();
        storage1.delete();
        storage1.store();
        System.out.println("----------------------------------------");

        Plastic plastic = new Plastic();
        plastic.hard();
        plastic.soft();
        Material material = new Material();
        material.hard();
        material.soft();
        Material material1 = new Plastic();
        material1.hard();
        material1.soft();
        System.out.println("----------------------------------------");

        Breakfast breakfast = new Breakfast();
        breakfast.cook();
        breakfast.eat();
        Meal meal = new Meal();
        meal.cook();
        meal.eat();
        Meal meal1 = new Breakfast();
        meal1.cook();
        meal1.eat();
        System.out.println("----------------------------------------");

        Bike bike = new Bike();
        bike.car();
        bike.truck();
        Transportation transportation = new Transportation();
        transportation.car();
        transportation.truck();
        Transportation transportation1 = new Bike();
        transportation1.car();
        transportation1.truck();
        System.out.println("----------------------------------------");

        Junk junk = new Junk();
        junk.eat();
        junk.waste();
        System.out.println("----------------------------------------");

        Frock frock = new Frock();
        frock.tear();
        frock.wear();
        Dress dress = new Dress();
        dress.tear();
        dress.wear();
        Dress dress1 = new Frock();
        dress1.tear();
        dress1.wear();
        System.out.println("----------------------------------------");

        Pizza pizza = new Pizza();
        pizza.cook();
        pizza.eat();
        Food food = new Food();
        food.cook();
        food.eat();
        Food food1= new Pizza();
        food1.cook();
        food1.eat();
        System.out.println("----------------------------------------");

        Bulb bulb = new Bulb();
        bulb.off();
        bulb.on();
        Light light = new Light();
        light.off();
        light.on();
        Light light1 = new Bulb();
        light1.off();
        light1.on();
        System.out.println("----------------------------------------");

        Tennis tennis = new Tennis();
        tennis.field();
        tennis.play();
        Sports sports = new Sports();
        sports.field();
        sports.play();
        Sports sports1 = new Tennis();
        sports1.field();
        sports1.play();
        System.out.println("----------------------------------------");

        Teaching teaching = new Teaching();
        teaching.teach();
        teaching.beat();
        Profession profession =new Profession();
        profession.beat();
        profession.teach();
        Profession profession1 =new Teaching();
        profession1.beat();
        profession1.teach();
        System.out.println("----------------------------------------");

        Nike nike = new Nike();
        nike.buy();
        nike.sell();
        Brand brand = new Brand();
        brand.buy();
        brand.sell();
        Brand brand1 = new Nike();
        brand1.buy();
        brand1.sell();
        System.out.println("----------------------------------------");

        Door door = new Door();
        door.closeDoor();
        door.openDoor();
        Wood wood = new Wood();
        wood.closeDoor();
        wood.openDoor();
        Wood wood1 = new Door();
        wood1.closeDoor();
        wood1.openDoor();
        System.out.println("----------------------------------------");

        HumanoidRobot humanoidRobot = new HumanoidRobot();
        humanoidRobot.talk();
        humanoidRobot.walk();
        Robot robot = new Robot();
        robot.talk();
        robot.walk();
        Robot robot1 = new HumanoidRobot();
        robot1.talk();
        robot1.walk();
        System.out.println("----------------------------------------");

        Winter winter = new Winter();
        winter.fall();
        winter.spring();
        Season season = new Season();
        season.fall();
        season.spring();
        Season season1 = new Winter();
        season1.fall();
        season1.spring();
        System.out.println("----------------------------------------");

        Trex trex = new Trex();
        trex.kill();
        trex.walk();
        Dinosour dinosour = new Dinosour();
        dinosour.kill();
        dinosour.walk();
        Dinosour dinosour1 = new Trex();
        dinosour1.kill();
        dinosour1.walk();
        System.out.println("----------------------------------------");

        CleaningService cleaningService = new CleaningService();
        cleaningService.cleanHall();
        cleaningService.cleanRoom();
        Service service = new Service();
        service.cleanHall();
        service.cleanRoom();
        Service service1 = new CleaningService();
        service1.cleanHall();
        service1.cleanRoom();
        System.out.println("----------------------------------------");

        Rhino rhino = new Rhino();
        rhino.die();
        rhino.live();
        MythicalCreature mythicalCreature = new MythicalCreature();
        mythicalCreature.die();
        mythicalCreature.live();
        MythicalCreature mythicalCreature1 = new Rhino();
        mythicalCreature1.die();
        mythicalCreature1.live();
        System.out.println("----------------------------------------");

        Pipe pipe = new Pipe();
        pipe.breakPipe();
        pipe.fix();
        Metal metal = new Metal();
        metal.fix();
        metal.breakPipe();
        Metal metal1 = new Pipe();
        metal1.fix();
        metal1.breakPipe();
        System.out.println("----------------------------------------");

        Cold cold = new Cold();
        cold.takeSyrup();
        cold.takeTablet();
        Disease disease= new Disease();
        disease.takeSyrup();
        disease.takeTablet();
        Disease disease1= new Cold();
        disease1.takeSyrup();
        disease1.takeTablet();
        System.out.println("----------------------------------------");

        BlackHole blackHole = new BlackHole();
        blackHole.black();
        blackHole.hole();
        SpaceObject spaceObject = new SpaceObject();
        spaceObject.black();
        spaceObject.hole();
        SpaceObject spaceObject1 = new BlackHole();
        spaceObject1.black();
        spaceObject1.hole();
        System.out.println("----------------------------------------");

        Asia asia = new Asia();
        asia.map();
        asia.population();
        Continent continent = new Continent();
        continent.map();
        continent.population();
        Continent continent1 = new Asia();
        continent1.map();
        continent1.population();
        System.out.println("----------------------------------------");

        India india = new India();
        india.state();
        india.people();
        Country country = new Country();
        country.people();
        country.state();
        Country country1 = new India();
        country1.people();
        country1.state();
        System.out.println("----------------------------------------");

        Bitcoin bitcoin = new Bitcoin();
        bitcoin.steelCoin();
        bitcoin.metalCoin();
        Coin coin = new Coin();
        coin.metalCoin();
        coin.steelCoin();
        Coin coin1 = new Bitcoin();
        coin1.metalCoin();
        coin1.steelCoin();
        System.out.println("----------------------------------------");

        Firewall firewall = new Firewall();
        firewall.layer();
        firewall.wall();
        Security security = new Security();
        security.layer();
        security.wall();
        Security security1 = new Firewall();
        security1.layer();
        security1.wall();
        System.out.println("----------------------------------------");

        Java java = new Java();
        java.code();
        java.lines();
        ProgrammingLang programmingLang = new ProgrammingLang();
        programmingLang.code();
        programmingLang.lines();
        ProgrammingLang programmingLang1 = new Java();
        programmingLang1.code();
        programmingLang1.lines();
        System.out.println("----------------------------------------");

        WashingMachine washingMachine = new WashingMachine();
        washingMachine.wash();
        washingMachine.dry();
        Machine machine = new Machine();
        machine.dry();
        machine.wash();
        Machine machine1 = new WashingMachine();
        machine1.dry();
        machine1.wash();
        System.out.println("----------------------------------------");

        Chrome chrome = new Chrome();
        chrome.search();
        chrome.edit();
        Browser browser= new Browser();
        browser.edit();
        browser.search();
        Browser browser1= new Chrome();
        browser1.edit();
        browser1.search();
        System.out.println("----------------------------------------");

        ActionMovie actionMovie = new ActionMovie();
        actionMovie.stop();
        actionMovie.watch();
        Movie movie = new Movie();
        movie.stop();
        movie.watch();
        Movie movie1 = new ActionMovie();
        movie1.stop();
        movie1.watch();
        System.out.println("----------------------------------------");

        Legoset legoset = new Legoset();
        legoset.build();
        legoset.play();
        Toys toys = new Toys();
        toys.build();
        toys.play();
        Toys toys1 = new Legoset();
        toys1.build();
        toys1.play();
        System.out.println("----------------------------------------");

        Tshirt tshirt = new Tshirt();
        tshirt.stitch();
        tshirt.wear();
        Clothing clothing = new Clothing();
        clothing.stitch();
        clothing.wear();
        Clothing clothing1 = new Tshirt();
        clothing1.stitch();
        clothing1.wear();
        System.out.println("----------------------------------------");

        Comic comic =new Comic();
        comic.read();
        comic.tear();
        Books books = new Books();
        books.read();
        books.tear();
        Books books1 = new Comic();
        books1.read();
        books1.tear();
        System.out.println("----------------------------------------");

        Invoice invoice = new Invoice();
        invoice.read();
        invoice.write();
        Doc doc = new Doc();
        doc.read();
        doc.write();
        Doc doc1 = new Invoice();
        doc1.read();
        doc1.write();
        System.out.println("----------------------------------------");

        TajMahal tajMahal = new TajMahal();
        tajMahal.build();
        tajMahal.destroy();
        Monument monument = new Monument();
        monument.build();
        monument.destroy();
        Monument monument1 = new TajMahal();
        monument1.build();
        monument1.destroy();
        System.out.println("----------------------------------------");

        Carrom carrom = new Carrom();
        carrom.play();
        carrom.turn();
        Games games = new Games();
        games.play();
        games.turn();
        Games games1 = new Carrom();
        games1.play();
        games1.turn();
        System.out.println("----------------------------------------");

        Airplane airplane = new Airplane();
        airplane.travel();
        airplane.ticket();
        Transport transport = new Transport();
        transport.ticket();
        transport.travel();
        Transport transport1 = new Airplane();
        transport1.ticket();
        transport1.travel();
        System.out.println("----------------------------------------");

        TechStartup techStartup = new TechStartup();
        techStartup.place();
        techStartup.campus();
        Company company = new Company();
        company.campus();
        company.place();
        Company company1 = new TechStartup();
        company1.campus();
        company1.place();
        System.out.println("----------------------------------------");

        BussinessGame bussinessGame = new BussinessGame();
        bussinessGame.move();
        bussinessGame.play();
        BoardGames boardGames = new BoardGames();
        boardGames.move();
        boardGames.play();
        BoardGames boardGames1 = new BussinessGame();
        boardGames1.move();
        boardGames1.play();
        System.out.println("----------------------------------------");

        Seeds seeds = new Seeds();
        seeds.plant();
        seeds.takeOut();
        Lotusseeds lotusseeds = new Lotusseeds();
        lotusseeds.plant();
        lotusseeds.takeOut();
        Lotusseeds lotusseeds1 = new Seeds();
        lotusseeds1.plant();
        lotusseeds1.takeOut();
        System.out.println("----------------------------------------");

        Puma puma = new Puma();
        puma.buy();
        puma.purchase();
        Brands brands = new Brands();
        brands.buy();
        brands.purchase();
        Brands brands1 = new Puma();
        brands1.buy();
        brands1.purchase();
        System.out.println("----------------------------------------");

        Iphone iphone = new Iphone();
        iphone.operate();
        iphone.switchoff();
        Mobile mobile = new Mobile();
        mobile.operate();
        mobile.switchoff();
        Mobile mobile1 = new Iphone();
        mobile1.operate();
        mobile1.switchoff();
        System.out.println("----------------------------------------");

        Biba biba = new Biba();
        biba.buy();
        biba.select();
        ClothingBrand clothingBrand = new ClothingBrand();
        clothingBrand.buy();
        clothingBrand.select();
        ClothingBrand clothingBrand1 = new Biba();
        clothingBrand1.buy();
        clothingBrand1.select();
        System.out.println("----------------------------------------");

        Black black = new Black();
        black.rainbow();
        black.select();
        Colour colour = new Colour();
        colour.rainbow();
        colour.select();
        Colour colour1 = new Black();
        colour1.rainbow();
        colour1.select();
        System.out.println("----------------------------------------");

        Shiva shiva = new Shiva();
        shiva.patience();
        shiva.pray();
        God god = new God();
        god.patience();
        god.pray();
        God god1= new Shiva();
        god1.patience();
        god1.pray();
        System.out.println("----------------------------------------");

        Mango mango = new Mango();
        mango.eat();
        mango.melt();
        Flavour flavour = new Flavour();
        flavour.eat();
        flavour.melt();
        Flavour flavour1 = new Mango();
        flavour1.eat();
        flavour1.melt();
        System.out.println("----------------------------------------");

        Butterscotch butterscotch = new Butterscotch();
        butterscotch.eat();
        butterscotch.spill();
        IceCream iceCream = new IceCream();
        iceCream.eat();
        iceCream.spill();
        IceCream iceCream1 = new Butterscotch();
        iceCream1.eat();
        iceCream1.spill();
        System.out.println("----------------------------------------");

        Lollipop lollipop = new Lollipop();
        lollipop.melt();
        lollipop.sip();
        Candy candy = new Candy();
        candy.sip();
        candy.melt();
        Candy candy1 = new Lollipop();
        candy1.sip();
        candy1.melt();
        System.out.println("----------------------------------------");

        Levis levis = new Levis();
        levis.wearIt();
        levis.wearOff();
        TshirtBrand tshirtBrand =  new TshirtBrand();
        tshirtBrand.wearIt();
        tshirtBrand.wearOff();
        TshirtBrand tshirtBrand1 =  new Levis();
        tshirtBrand1.wearIt();
        tshirtBrand1.wearOff();
        System.out.println("----------------------------------------");

        Brown brown = new Brown();
        brown.paint();
        biba.buy();
        DressColor dressColor = new DressColor();
        dressColor.paint();
        dressColor.wash();
        DressColor dressColor1 = new Brown();
        dressColor1.paint();
        dressColor1.wash();
        System.out.println("----------------------------------------");

        CoronaExtra coronaExtra = new CoronaExtra();
        coronaExtra.chug();
        coronaExtra.drink();
        Beer beer = new Beer();
        beer.chug();
        beer.drink();
        Beer beer1 = new CoronaExtra();
        beer1.chug();
        beer1.drink();
        System.out.println("----------------------------------------");

        CarlsBerg carlsBerg = new CarlsBerg();
        carlsBerg.chug();
        carlsBerg.drunk();
        TastyBeer tastyBeer = new TastyBeer();
        tastyBeer.chug();
        tastyBeer.drunk();
        TastyBeer tastyBeer1 = new CarlsBerg();
        tastyBeer1.chug();
        tastyBeer1.drunk();
        System.out.println("----------------------------------------");

        JackDaniels jackDaniels = new JackDaniels();
        jackDaniels.thirty();
        jackDaniels.sixty();
        Whisky whisky = new Whisky();
        whisky.sixty();
        whisky.thirty();
        Whisky whisky1 = new Whisky();
        whisky.sixty();
        whisky.thirty();
        System.out.println("----------------------------------------");

        Goggles goggles = new Goggles();
        goggles.remove();
        goggles.wear();
        Specs specs = new Specs();
        specs.remove();
        specs.wear();
        Specs specs1= new Goggles();
        specs1.remove();
        specs1.wear();
        System.out.println("----------------------------------------");

        Jamun jamun = new Jamun();
        jamun.fry();
        jamun.prepare();
        Sweet sweet = new Sweet();
        sweet.fry();
        sweet.prepare();
        Sweet sweet1 = new Jamun();
        sweet1.fry();
        sweet1.prepare();
        System.out.println("----------------------------------------");

        Sunglasses sunglasses = new Sunglasses();
        sunglasses.clean();
        sunglasses.wear();
        Shades shades = new Shades();
        shades.clean();
        shades.wear();
        Shades shades1 = new Sunglasses();
        shades1.clean();
        shades1.wear();
        System.out.println("----------------------------------------");

        Insta insta = new Insta();
        insta.use();
        insta.block();
        SocialMedia socialMedia = new SocialMedia();
        socialMedia.use();
        socialMedia.block();
        SocialMedia socialMedia1 = new Insta();
        socialMedia1.use();
        socialMedia1.block();
        System.out.println("----------------------------------------");

        Snapchat snapchat = new Snapchat();
        snapchat.click();
        snapchat.filter();
        Camera camera = new Camera();
        camera.click();
        camera.filter();
        Camera camera1 = new Snapchat();
        camera1.click();
        camera1.filter();
        System.out.println("----------------------------------------");

        Vadapav vadapav = new Vadapav();
        vadapav.smell();
        vadapav.tasty();
        Snack snack = new Snack();
        snack.smell();
        snack.tasty();
        Snack snack1 = new Vadapav();
        snack1.smell();
        snack1.tasty();
        System.out.println("----------------------------------------");

        Maggie maggie = new Maggie();
        maggie.cook();
        maggie.twomin();
        Bad bad = new Bad();
        bad.cook();
        bad.twomin();
        Bad bad1 = new Maggie();
        bad1.cook();
        bad1.twomin();
        System.out.println("----------------------------------------");

        Rangerover rangerover = new Rangerover();
        rangerover.drive();
        rangerover.park();
        LuxuryCar luxuryCar = new LuxuryCar();
        luxuryCar.drive();
        luxuryCar.park();
        LuxuryCar luxuryCar1 = new Rangerover();
        luxuryCar1.drive();
        luxuryCar1.park();
        System.out.println("----------------------------------------");

        Cement cement = new Cement();
        cement.breakIt();
        cement.build();
        BuildingMaterial buildingMaterial = new BuildingMaterial();
        buildingMaterial.breakIt();
        buildingMaterial.build();
        BuildingMaterial buildingMaterial1 = new Cement();
        buildingMaterial1.breakIt();
        buildingMaterial1.build();
        System.out.println("----------------------------------------");

        Sky sky = new Sky();
        sky.rain();
        sky.fall();
        Beautiful beautiful = new Beautiful();
        beautiful.fall();
        beautiful.rain();
        Beautiful beautiful1 = new Sky();
        beautiful1.fall();
        beautiful1.rain();
        System.out.println("----------------------------------------");

        Slipper slipper = new Slipper();
        slipper.removing();
        slipper.wearing();
        Footwear footwear =  new Footwear();
        footwear.removing();
        footwear.wearing();
        Footwear footwear1 =  new Slipper();
        footwear1.removing();
        footwear1.wearing();
        System.out.println("----------------------------------------");

        Pot pot = new Pot();
        pot.sow();
        pot.reap();
        Thing thing = new Thing();
        thing.reap();
        thing.sow();
        Thing thing1 = new Pot();
        thing1.reap();
        thing1.sow();
        System.out.println("================================================");

        PassBook passBook = new PassBook();
        passBook.checkBalance(account);
        passBook.open();
        passBook.close();
        passBook.check();
        passBook.closeAll();
        passBook.act();
        System.out.println("----------------------------------------");

        SpiderMan spiderMan = new SpiderMan();
        spiderMan.jump(actionMovie);
        spiderMan.act();
        spiderMan.see();
        spiderMan.seen();
        spiderMan.stop();
        spiderMan.watch();
        System.out.println("----------------------------------------");

        AcessController acessController = new AcessController();
        acessController.fetchDetails(admin);
        acessController.control();
        acessController.hack();
        acessController.use();
        acessController.open();
        acessController.close();
        System.out.println("----------------------------------------");

        Jet jet = new Jet();
        jet.flyHigh(airplane);
        jet.fly();
        jet.purchase();
        jet.flyThroughout();
        jet.ticket();
        jet.ticket();
        System.out.println("----------------------------------------");

        Rat rat = new Rat();
        rat.kill(animal);
        rat.pee();
        rat.poop();
        rat.follow();
        rat.bark();
        rat.see();
        System.out.println("----------------------------------------");

        Syrup syrup = new Syrup();
        syrup.cough(apple);
        syrup.grow();
        syrup.eat();
        syrup.cut();
        syrup.pick();
        syrup.vomit();
        System.out.println("----------------------------------------");

        IronBox ironBox = new IronBox();
        ironBox.iron(appliance);
        appliance.repair();
        appliance.use();
        appliance.destroy();
        appliance.on();
        appliance.off();
        System.out.println("----------------------------------------");

        Bankrupt bankrupt = new Bankrupt();
        bankrupt.checkBalance(bankrupt);
        bankrupt.open();
        bankrupt.close();
        bankrupt.deposit();
        bankrupt.check();
        bankrupt.remove();
        System.out.println("----------------------------------------");

        KingFisher kingFisher = new KingFisher();
        kingFisher.getDrunk(beer);
        kingFisher.drink();
        kingFisher.chug();
        kingFisher.sour();
        kingFisher.yellow();
        kingFisher.spill();
        System.out.println("----------------------------------------");

        VelvateenRabbit velvateenRabbit = new VelvateenRabbit();
        velvateenRabbit.read(books);
        velvateenRabbit.print();
        velvateenRabbit.read();
        velvateenRabbit.write();
        velvateenRabbit.thick();
        velvateenRabbit.tear();
        System.out.println("----------------------------------------");

        Coach coach = new Coach();
        coach.luxury(brand);
        coach.promote();
        coach.wearIt();
        coach.purchase();
        coach.buy();
        coach.sell();
        System.out.println("----------------------------------------");

        USCoin usCoin = new USCoin();
        usCoin.bronze(coin);
        usCoin.circle();
        usCoin.flip();
        usCoin.grey();
        usCoin.steelCoin();
        usCoin.metalCoin();
        System.out.println("----------------------------------------");

        Aprilla aprilla = new Aprilla();
        aprilla.drive(bike);
        aprilla.activa();
        aprilla.honda();
        aprilla.vespa();
        aprilla.truck();
        aprilla.car();
        System.out.println("----------------------------------------");

        China china = new China();
        china.travel(asia);
        china.men();
        china.women();
        china.people();
        china.population();
        china.map();
        System.out.println("----------------------------------------");

        Website website = new Website();
        website.search(chrome);
        website.open();
        website.close();
        website.decorate();
        website.edit();
        website.search();
        System.out.println("----------------------------------------");

        Sequence sequence = new Sequence();
        sequence.playIt(boardGames);
        sequence.play();
        sequence.move();
        sequence.find();
        sequence.open();
        sequence.close();
        System.out.println("----------------------------------------");

        Bangle bangle = new Bangle();
        bangle.wearIt(circle);
        bangle.full();
        bangle.half();
        bangle.semi();
        bangle.draw();
        bangle.insert();
        System.out.println("----------------------------------------");

        Crow crow = new Crow();
        crow.flyHigh(bird);
        bird.eat();
        bird.flucker();
        bird.fly();
        bird.sleep();
        bird.move();
        System.out.println("----------------------------------------");

        Tata tata = new Tata();
        tata.permit(company);
        tata.method4();
        tata.method5();
        tata.roam();
        tata.place();
        tata.campus();
        System.out.println("----------------------------------------");

        Africa africa = new Africa();
        africa.see(country);
        africa.china();
        africa.india();
        africa.people();
        africa.state();
        africa.cities();
        System.out.println("----------------------------------------");

        Dosa dosa = new Dosa();
        dosa.eat(breakfast);
        dosa.eat();
        dosa.prepare();
        dosa.cook();
        dosa.serve();
        dosa.decor();
        System.out.println("----------------------------------------");

        OffShoulder offShoulder = new OffShoulder();
        offShoulder.style(dress);
        offShoulder.wear();
        offShoulder.top();
        offShoulder.tear();
        offShoulder.fashion();
        offShoulder.style();
        System.out.println("----------------------------------------");

        AadharCard aadharCard = new AadharCard();
        aadharCard.see(file);
        aadharCard.open();
        aadharCard.close();
        aadharCard.edit();
        aadharCard.doc();
        aadharCard.search();
        System.out.println("----------------------------------------");

        Jeans jeans = new Jeans();
        jeans.wear(cloth);
        jeans.wear();
        jeans.dry();
        jeans.wash();
        jeans.torn();
        jeans.style();
        System.out.println("----------------------------------------");

        ChocoChips chocoChips = new ChocoChips();
        chocoChips.eat(candy);
        chocoChips.eat();
        chocoChips.lick();
        chocoChips.sip();
        chocoChips.melt();
        chocoChips.taste();
        System.out.println("----------------------------------------");

        Tinkel tinkel = new Tinkel();
        tinkel.read(comic);
        tinkel.read();
        tinkel.write();
        tinkel.roll();
        tinkel.tear();
        tinkel.author();
        System.out.println("----------------------------------------");

        Sodium sodium = new Sodium();
        sodium.explode(element);
        sodium.method1();
        sodium.method2();
        sodium.method3();
        sodium.method4();
        sodium.method5();
        System.out.println("----------------------------------------");

        Lounge lounge = new Lounge();
        lounge.see(sky);
        lounge.watch();
        lounge.rain();
        lounge.rain1();
        lounge.rain2();
        lounge.rain3();
        System.out.println("----------------------------------------");

        Table table = new Table();
        table.sit(wood);
        table.openDoor();
        table.closeDoor();
        table.closeDoor1();
        table.closeDoor2();
        table.closeDoor3();
        System.out.println("----------------------------------------");

        USPolo usPolo = new USPolo();
        usPolo.wear(tshirt);
        usPolo.wear();
        usPolo.stitch();
        usPolo.stitch1();
        usPolo.stitch2();
        usPolo.stitch3();
        System.out.println("----------------------------------------");

        Helicopter helicopter=new Helicopter();
        helicopter.fly(vehicle);
        helicopter.drive();
        helicopter.park();
        helicopter.park1();
        helicopter.park2();
        helicopter.park3();
        System.out.println("----------------------------------------");

        Piano piano = new Piano();
        piano.play(instrument);
        piano.play();
        piano.stop();
        piano.stop1();
        piano.stop2();
        piano.stop3();
        System.out.println("----------------------------------------");

        Wifi wifi = new Wifi();
        wifi.search(network);
        wifi.speed();
        wifi.slow();
        wifi.slow1();
        wifi.slow2();
        wifi.slow3();
        System.out.println("----------------------------------------");

        Ibm ibm = new Ibm();
        ibm.wash(washingMachine);
        ibm.wash();
        ibm.dry();
        ibm.dry1();
        ibm.dry2();
        ibm.dry3();
        System.out.println("----------------------------------------");

        Ios ios = new Ios();
        ios.use(iphone);
        ios.operate();
        ios.switchoff();
        ios.switchoff1();
        ios.switchoff2();
        ios.switchoff3();
        System.out.println("----------------------------------------");

        French french = new French();
        french.learn(language);
        french.study();
        french.write();
        french.write1();
        french.write2();
        french.write3();
        System.out.println("----------------------------------------");

        WoodStick woodStick = new WoodStick();
        woodStick.beat(hammer);
        woodStick.screw();
        woodStick.open();
        woodStick.open1();
        woodStick.open2();
        woodStick.open3();
        System.out.println("----------------------------------------");

        Dewars dewars = new Dewars();
        dewars.drink(whisky);
        dewars.sixty();
        dewars.thirty();
        dewars.thirty1();
        dewars.thirty2();
        dewars.thirty3();
        System.out.println("----------------------------------------");

        Mocktail mocktail = new Mocktail();
        mocktail.drink(drink);
        mocktail.drinkTea();
        mocktail.spillTea();
        mocktail.spillTea1();
        mocktail.spillTea2();
        mocktail.spillTea3();
        System.out.println("----------------------------------------");

        Ice ice = new Ice();
        ice.melt(mango);
        ice.eat();
        ice.melt();
        ice.melt1();
        ice.melt2();
        ice.melt3();
        System.out.println("----------------------------------------");

        IceFlavour iceFlavour = new IceFlavour();
        iceFlavour.eat(jamun);
        iceFlavour.prepare();
        iceFlavour.fry();
        iceFlavour.fry1();
        iceFlavour.fry2();
        iceFlavour.fry3();
        System.out.println("----------------------------------------");

        Developer developer = new Developer();
        developer.coder(java);
        developer.code();
        developer.lines();
        developer.lines1();
        developer.lines2();
        developer.lines3();
        System.out.println("----------------------------------------");

        JackFruit jackFruit = new JackFruit();
        jackFruit.peal(fruit);
        jackFruit.eat();
        jackFruit.cut();
        jackFruit.cut1();
        jackFruit.cut2();
        jackFruit.cut3();
        System.out.println("----------------------------------------");

        TableStand tableStand = new TableStand();
        tableStand.keep(light);
        tableStand.on();
        tableStand.off();
        tableStand.off1();
        tableStand.off2();
        tableStand.off3();
        System.out.println("----------------------------------------");

        Architecture architecture = new Architecture();
        architecture.build(tajMahal);
        architecture.build();
        architecture.destroy();
        architecture.destroy1();
        architecture.destroy2();
        architecture.destroy3();
        System.out.println("----------------------------------------");

        Fever fever = new Fever();
        fever.sweat(disease);
        fever.takeTablet();
        fever.takeSyrup();
        fever.takeSyrup1();
        fever.takeSyrup2();
        fever.takeSyrup3();
        System.out.println("----------------------------------------");

        Brunch brunch = new Brunch();
        brunch.eat(meal);
        brunch.eat();
        brunch.cook();
        brunch.cook1();
        brunch.cook2();
        brunch.cook3();
        System.out.println("----------------------------------------");

        Fiber fiber = new Fiber();
        fiber.sit(chair);
        fiber.move();
        fiber.build();
        fiber.build1();
        fiber.build2();
        fiber.build3();
        System.out.println("----------------------------------------");

        Earrings earrings = new Earrings();
        earrings.wear(metal);
        earrings.fix();
        earrings.breakPipe();
        earrings.breakPipe1();
        earrings.breakPipe2();
        earrings.breakPipe3();
        System.out.println("----------------------------------------");

        Flats flats = new Flats();
        flats.wear(flats);
        flats.wearing();
        flats.removing();
        flats.removing1();
        flats.removing2();
        flats.removing3();
        System.out.println("----------------------------------------");











    }
}
