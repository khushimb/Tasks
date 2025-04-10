package com.xworkz.ObjectToString.runner;

import com.xworkz.ObjectToString.internal.*;

import javax.sound.midi.Soundbank;

public class Runner {
    public static void main(String[] args) {

        Alert alert = new Alert("typo ","delete ","yes");
        System.out.println("Representation Of Alert: "+alert);
        System.out.println("Generated Hash Code "+System.identityHashCode(alert));
        System.out.println("Defined Hash Code : "+alert.hashCode());
        System.out.println("=================================================");


        Api api = new Api("fully","high","at risk");
        System.out.println("Representation Of Api: "+api);
        System.out.println("Generated Hash Code "+System.identityHashCode(api));
        System.out.println("Defined Hash Code : "+api.hashCode());
        System.out.println("=================================================");


        App app = new App("poco","windows","chrome");
        System.out.println("Representation Of App: "+app);
        System.out.println("Generated Hash Code "+System.identityHashCode(app));
        System.out.println("Defined Hash Code : "+app.hashCode());
        System.out.println("=================================================");


        Avatar avatar = new Avatar(1,2,6);
        System.out.println("Representation Of Avatar: "+avatar);
        System.out.println("Generated Hash Code "+System.identityHashCode(avatar));
        System.out.println("Defined Hash Code : "+avatar.hashCode());
        System.out.println("=================================================");

        Badge badge = new Badge("pink",600,"polyster");
        System.out.println("Representation Of Badge: "+badge);
        System.out.println("Generated Hash Code "+System.identityHashCode(badge));
        System.out.println("Defined Hash Code : "+badge.hashCode());
        System.out.println("=================================================");

        Banner banner = new Banner("valid",800,60);
        System.out.println("Representation Of Banner: "+banner);
        System.out.println("Generated Hash Code "+System.identityHashCode(banner));
        System.out.println("Defined Hash Code : "+banner.hashCode());
        System.out.println("=================================================");


        Border border = new Border("red",80,"dotted");
        System.out.println("Representation Of Border: "+border);
        System.out.println("Generated Hash Code "+System.identityHashCode(border));
        System.out.println("Defined Hash Code : "+border.hashCode());
        System.out.println("=================================================");


        Box box = new Box("yellow",5,'L');
        System.out.println("Representation Of Box: "+box);
        System.out.println("Generated Hash Code "+System.identityHashCode(box));
        System.out.println("Defined Hash Code : "+box.hashCode());
        System.out.println("=================================================");


        Button button = new Button("first","second","high voltage");
        System.out.println("Representation Of Button: "+button);
        System.out.println("Generated Hash Code "+System.identityHashCode(button));
        System.out.println("Defined Hash Code : "+button.hashCode());
        System.out.println("=================================================");


        Calender calender = new Calender("2003","sunday","july ");
        System.out.println("Representation Of Calender: "+calender);
        System.out.println("Generated Hash Code "+System.identityHashCode(calender));
        System.out.println("Defined Hash Code : "+calender.hashCode());
        System.out.println("=================================================");

        Canvas canvas = new Canvas("pink",600,"plastic");
        System.out.println("Representation Of Canvas: "+canvas);
        System.out.println("Generated Hash Code "+System.identityHashCode(canvas));
        System.out.println("Defined Hash Code : "+canvas.hashCode());
        System.out.println("=================================================");

        Card card = new Card("brown",250,"thick");
        System.out.println("Representation Of Card: "+card);
        System.out.println("Generated Hash Code "+System.identityHashCode(card));
        System.out.println("Defined Hash Code : "+card.hashCode());
        System.out.println("=================================================");


        Chart chart = new Chart(20,250,"small");
        System.out.println("Representation Of Chart: "+chart);
        System.out.println("Generated Hash Code "+System.identityHashCode(chart));
        System.out.println("Defined Hash Code : "+chart.hashCode());
        System.out.println("=================================================");


        CheckBox checkBox = new CheckBox(10,65,"yes");
        System.out.println("Representation Of CheckBox: "+checkBox);
        System.out.println("Generated Hash Code "+System.identityHashCode(checkBox));
        System.out.println("Defined Hash Code : "+checkBox.hashCode());
        System.out.println("=================================================");

        Checkout checkout = new Checkout("noon",3500,"banglore");
        System.out.println("Representation Of CheckBox: "+checkBox);
        System.out.println("Generated Hash Code "+System.identityHashCode(checkout));
        System.out.println("Defined Hash Code : "+checkout.hashCode());
        System.out.println("=================================================");

        Chip chip = new Chip("yellow",10,"lays");
        System.out.println("Representation Of Chip: "+chip);
        System.out.println("Generated Hash Code "+System.identityHashCode(chip));
        System.out.println("Defined Hash Code : "+chip.hashCode());
        System.out.println("=================================================");


        Comment comment = new Comment("afternoon",5,"instagram");
        System.out.println("Representation Of Comment: "+comment);
        System.out.println("Generated Hash Code "+System.identityHashCode(comment));
        System.out.println("Defined Hash Code : "+comment.hashCode());
        System.out.println("=================================================");

        Config config= new Config("null","website","tab");
        System.out.println("Representation Of Config: "+config);
        System.out.println("Generated Hash Code "+System.identityHashCode(config));
        System.out.println("Defined Hash Code : "+config.hashCode());
        System.out.println("=================================================");


        Container container= new Container('M',500,"nissan");
        System.out.println("Representation Of Container: "+container);
        System.out.println("Generated Hash Code "+System.identityHashCode(container));
        System.out.println("Defined Hash Code : "+container.hashCode());
        System.out.println("=================================================");

        Dialog dialog = new Dialog("valid","terrific","code");
        System.out.println("Representation Of Dialog: "+dialog);
        System.out.println("Generated Hash Code "+System.identityHashCode(dialog));
        System.out.println("Defined Hash Code : "+dialog.hashCode());
        System.out.println("=================================================");

        Notification notification  = new Notification("watsapp","family","single");
        System.out.println("Representation Of Notification: "+notification);
        System.out.println("Generated Hash Code "+System.identityHashCode(notification));
        System.out.println("Defined Hash Code : "+notification.hashCode());
        System.out.println("=================================================");

        Doc doc = new Doc("archived","to email","class");
        System.out.println("Representation Of Doc: "+doc);
        System.out.println("Generated Hash Code "+System.identityHashCode(doc));
        System.out.println("Defined Hash Code : "+doc.hashCode());
        System.out.println("=================================================");


        DropDown dropDown = new DropDown("yes","no","partial");
        System.out.println("Representation Of Dropdown: "+dropDown);
        System.out.println("Generated Hash Code "+System.identityHashCode(dropDown));
        System.out.println("Defined Hash Code : "+dropDown.hashCode());
        System.out.println("=================================================");

        Engine engine = new Engine("200","50","some parts");
        System.out.println("Representation Of Engine: "+engine);
        System.out.println("Generated Hash Code "+System.identityHashCode(engine));
        System.out.println("Defined Hash Code : "+engine.hashCode());
        System.out.println("=================================================");

        Env env = new Env("70%","50%","75%");
        System.out.println("Representation Of Env: "+env);
        System.out.println("Generated Hash Code "+System.identityHashCode(env));
        System.out.println("Defined Hash Code : "+env.hashCode());
        System.out.println("=================================================");


        Event event = new Event("bday","marriage","bday");
        System.out.println("Representation Of event: "+event);
        System.out.println("Generated Hash Code "+System.identityHashCode(event));
        System.out.println("Defined Hash Code : "+event.hashCode());
        System.out.println("=================================================");

        Feed feed = new Feed("murder","politics","MP");
        System.out.println("Representation Of Feed: "+feed);
        System.out.println("Generated Hash Code "+System.identityHashCode(feed));
        System.out.println("Defined Hash Code : "+feed.hashCode());
        System.out.println("=================================================");

        Filter filter = new Filter("on","hearts","dog");
        System.out.println("Representation Of filter: "+filter);
        System.out.println("Generated Hash Code "+System.identityHashCode(filter));
        System.out.println("Defined Hash Code : "+filter.hashCode());
        System.out.println("=================================================");

        Flag flag = new Flag("yes","Indian","Flag");
        System.out.println("Representation Of Flag: "+flag);
        System.out.println("Generated Hash Code "+System.identityHashCode(flag));
        System.out.println("Defined Hash Code : "+flag.hashCode());
        System.out.println("=================================================");

        Flex flex = new Flex("few","many","corner");
        System.out.println("Representation Of Flex: "+flex);
        System.out.println("Generated Hash Code "+System.identityHashCode(flex));
        System.out.println("Defined Hash Code : "+flex.hashCode());
        System.out.println("=================================================");

        Footer footer = new Footer("small","around corner","manager");
        System.out.println("Representation Of Footer: "+footer);
        System.out.println("Generated Hash Code "+System.identityHashCode(footer));
        System.out.println("Defined Hash Code : "+footer.hashCode());
        System.out.println("=================================================");

        Form form = new Form("short","long ","long");
        System.out.println("Representation Of Form: "+form);
        System.out.println("Generated Hash Code "+System.identityHashCode(form));
        System.out.println("Defined Hash Code : "+form.hashCode());
        System.out.println("=================================================");

        Gallery gallery = new Gallery("5 grid","6 list ","few");
        System.out.println("Representation Of Gallery: "+gallery);
        System.out.println("Generated Hash Code "+System.identityHashCode(gallery));
        System.out.println("Defined Hash Code : "+gallery.hashCode());
        System.out.println("=================================================");

        Grid grid = new Grid("10","9 ","2");
        System.out.println("Representation Of Grid: "+grid);
        System.out.println("Generated Hash Code "+System.identityHashCode(grid));
        System.out.println("Defined Hash Code : "+grid.hashCode());
        System.out.println("=================================================");

        Header header = new Header("big","8 ","4");
        System.out.println("Representation Of Header: "+header);
        System.out.println("Generated Hash Code "+System.identityHashCode(header));
        System.out.println("Defined Hash Code : "+header.hashCode());
        System.out.println("=================================================");


        Highlight highlight = new Highlight("higher","lower","third");
        System.out.println("Representation Of Highlight: "+highlight);
        System.out.println("Generated Hash Code "+System.identityHashCode(highlight));
        System.out.println("Defined Hash Code : "+highlight.hashCode());
        System.out.println("=================================================");

        Icon icon = new Icon("Maggie","small ","yellow");
        System.out.println("Representation Of Icon: "+icon);
        System.out.println("Generated Hash Code "+System.identityHashCode(icon));
        System.out.println("Defined Hash Code : "+icon.hashCode());
        System.out.println("=================================================");

        Hook hook = new Hook("applying","small ","yellow");
        System.out.println("Representation Of Icon: "+icon);
        System.out.println("Generated Hash Code "+System.identityHashCode(hook));
        System.out.println("Defined Hash Code : "+hook.hashCode());
        System.out.println("=================================================");


        Image image = new Image("gallery","edit ","photos");
        System.out.println("Representation Of Image: "+image);
        System.out.println("Generated Hash Code "+System.identityHashCode(image));
        System.out.println("Defined Hash Code : "+image.hashCode());
        System.out.println("=================================================");


        Input input = new Input("code","folder ","100kb");
        System.out.println("Representation Of Input: "+input);
        System.out.println("Generated Hash Code "+System.identityHashCode(input));
        System.out.println("Defined Hash Code : "+input.hashCode());
        System.out.println("=================================================");

        Invoice invoice = new Invoice("555","5/5/23 ","a year");
        System.out.println("Representation Of Invoice: "+invoice);
        System.out.println("Generated Hash Code "+System.identityHashCode(invoice));
        System.out.println("Defined Hash Code : "+invoice.hashCode());
        System.out.println("=================================================");

        Item item = new Item("20","biscuit ","50");
        System.out.println("Representation Of Item: "+item);
        System.out.println("Generated Hash Code "+System.identityHashCode(item));
        System.out.println("Defined Hash Code : "+item.hashCode());
        System.out.println("=================================================");

        Label label = new Label("hi", "red","M");
        System.out.println("Representation Of Label: "+label);
        System.out.println("Generated Hash Code "+System.identityHashCode(label));
        System.out.println("Defined Hash Code : "+label.hashCode());
        System.out.println("=================================================");

        Link link = new Link("text","hey","a month");
        System.out.println("Representation Of Link: "+link);
        System.out.println("Generated Hash Code "+System.identityHashCode(link));
        System.out.println("Defined Hash Code : "+link.hashCode());
        System.out.println("=================================================");

        List list = new List("few","50","powder");
        System.out.println("Representation Of List: "+list);
        System.out.println("Generated Hash Code "+System.identityHashCode(list));
        System.out.println("Defined Hash Code : "+list.hashCode());
        System.out.println("=================================================");

        Loader loader= new Loader("heavy machine"," a week","brown");
        System.out.println("Representation Of Loader: "+loader);
        System.out.println("Generated Hash Code "+System.identityHashCode(loader));
        System.out.println("Defined Hash Code : "+loader.hashCode());
        System.out.println("=================================================");

        Location location= new Location("USA","washington","cincinaati");
        System.out.println("Representation Of Loaction: "+location);
        System.out.println("Generated Hash Code "+System.identityHashCode(location));
        System.out.println("Defined Hash Code : "+location.hashCode());
        System.out.println("=================================================");

        Log log= new Log("high","resignatation letter","Morning");
        System.out.println("Representation Of Log: "+log);
        System.out.println("Generated Hash Code "+System.identityHashCode(log));
        System.out.println("Defined Hash Code : "+log.hashCode());
        System.out.println("=================================================");

        Map map = new Map("steap","high","extra zoom");
        System.out.println("Representation Of map: "+map);
        System.out.println("Generated Hash Code "+System.identityHashCode(map));
        System.out.println("Defined Hash Code : "+map.hashCode());
        System.out.println("=================================================");

        Menu menu= new Menu("Sankam"," chinese","starters");
        System.out.println("Representation Of Menu: "+menu);
        System.out.println("Generated Hash Code "+System.identityHashCode(menu));
        System.out.println("Defined Hash Code : "+menu.hashCode());
        System.out.println("=================================================");

        Message message= new Message("Professor"," leave letter","evening");
        System.out.println("Representation Of message: "+message);
        System.out.println("Generated Hash Code "+System.identityHashCode(message));
        System.out.println("Defined Hash Code : "+message.hashCode());
        System.out.println("=================================================");

        Metric metric= new Metric("Square","few","square unit");
        System.out.println("Representation Of metric: "+metric);
        System.out.println("Generated Hash Code "+System.identityHashCode(metric));
        System.out.println("Defined Hash Code : "+metric.hashCode());
        System.out.println("=================================================");

        Modal modal= new Modal("foot","content","long");
        System.out.println("Representation Of Modal: "+modal);
        System.out.println("Generated Hash Code "+System.identityHashCode(modal));
        System.out.println("Defined Hash Code : "+modal.hashCode());
        System.out.println("=================================================");


        Mode mode= new Mode("Watsapp","avail","video");
        System.out.println("Representation Of Mode: "+mode);
        System.out.println("Generated Hash Code "+System.identityHashCode(mode));
        System.out.println("Defined Hash Code : "+mode.hashCode());
        System.out.println("=================================================");


        Nav nav = new Nav("content","content","person");
        System.out.println("Representation Of Nav: "+nav);
        System.out.println("Generated Hash Code "+System.identityHashCode(nav));
        System.out.println("Defined Hash Code : "+nav.hashCode());
        System.out.println("=================================================");


        Note note= new Note("Report","index","seminar report");
        System.out.println("Representation Of Note: "+note);
        System.out.println("Generated Hash Code "+System.identityHashCode(note));
        System.out.println("Defined Hash Code : "+note.hashCode());
        System.out.println("=================================================");


        Panel panel= new Panel("driver needed","details","avail");
        System.out.println("Representation Of Panel: "+panel);
        System.out.println("Generated Hash Code "+System.identityHashCode(panel));
        System.out.println("Defined Hash Code : "+panel.hashCode());
        System.out.println("=================================================");

        Payment payment= new Payment("upi","5000","done");
        System.out.println("Representation Of payment: "+payment);
        System.out.println("Generated Hash Code "+System.identityHashCode(payment));
        System.out.println("Defined Hash Code : "+payment.hashCode());
        System.out.println("=================================================");

        Pin pin= new Pin("837981","upi","completed");
        System.out.println("Representation Of Pin: "+pin);
        System.out.println("Generated Hash Code "+System.identityHashCode(pin));
        System.out.println("Defined Hash Code : "+pin.hashCode());
        System.out.println("=================================================");

        Player player= new Player("upi","5000","done");
        System.out.println("Representation Of Player: "+player);
        System.out.println("Generated Hash Code "+System.identityHashCode(player));
        System.out.println("Defined Hash Code : "+player.hashCode());
        System.out.println("=================================================");

        Playlist playlist= new Playlist("bollywood songs","phir mohabat","arijit singh");
        System.out.println("Representation Of Playlist: "+playlist);
        System.out.println("Generated Hash Code "+System.identityHashCode(playlist));
        System.out.println("Defined Hash Code : "+playlist.hashCode());
        System.out.println("=================================================");

        Post post= new Post("chetan bhagat","love story","2015");
        System.out.println("Representation Of post: "+post);
        System.out.println("Generated Hash Code "+System.identityHashCode(post));
        System.out.println("Defined Hash Code : "+post.hashCode());
        System.out.println("=================================================");

        Pricing pricing= new Pricing("6000","8000","rupees");
        System.out.println("Representation Of pricing: "+pricing);
        System.out.println("Generated Hash Code "+System.identityHashCode(pricing));
        System.out.println("Defined Hash Code : "+pricing.hashCode());
        System.out.println("=================================================");

        Profile profile= new Profile("khushi","khushi@gmail.com","developer");
        System.out.println("Representation Of Profile: "+profile);
        System.out.println("Generated Hash Code "+System.identityHashCode(profile));
        System.out.println("Defined Hash Code : "+profile.hashCode());
        System.out.println("=================================================");

        Progress progress= new Progress("constructor","35%","incomplete");
        System.out.println("Representation Of Progress: "+progress);
        System.out.println("Generated Hash Code "+System.identityHashCode(progress));
        System.out.println("Defined Hash Code : "+progress.hashCode());
        System.out.println("=================================================");

        Project project= new Project("Cancer ","september","sushanth");
        System.out.println("Representation Of Project: "+project);
        System.out.println("Generated Hash Code "+System.identityHashCode(project));
        System.out.println("Defined Hash Code : "+project.hashCode());
        System.out.println("=================================================");

        Quote quote= new Quote("banner ","subash","social");
        System.out.println("Representation Of Quote: "+quote);
        System.out.println("Generated Hash Code "+System.identityHashCode(quote));
        System.out.println("Defined Hash Code : "+quote.hashCode());
        System.out.println("=================================================");

        Radio radio= new Radio("max ","ndtv","kannada");
        System.out.println("Representation Of Radio: "+radio);
        System.out.println("Generated Hash Code "+System.identityHashCode(radio));
        System.out.println("Defined Hash Code : "+radio.hashCode());
        System.out.println("=================================================");

        Rank rank= new Rank("7 ","tushar","80");
        System.out.println("Representation Of Rank: "+rank);
        System.out.println("Generated Hash Code "+System.identityHashCode(rank));
        System.out.println("Defined Hash Code : "+rank.hashCode());
        System.out.println("=================================================");

        Reaction reaction= new Reaction("crying ","1","");
        System.out.println("Representation Of Project: "+project);
        System.out.println("Generated Hash Code "+System.identityHashCode(reaction));
        System.out.println("Defined Hash Code : "+reaction.hashCode());
        System.out.println("=================================================");

        Review review= new Review("User ","check all","5");
        System.out.println("Representation Of Review: "+review);
        System.out.println("Generated Hash Code "+System.identityHashCode(review));
        System.out.println("Defined Hash Code : "+review.hashCode());
        System.out.println("=================================================");

        Search search= new Search("find ","pass","hearts");
        System.out.println("Representation Of Search: "+search);
        System.out.println("Generated Hash Code "+System.identityHashCode(search));
        System.out.println("Defined Hash Code : "+search.hashCode());
        System.out.println("=================================================");

        Section section= new Section("asha ","september","all");
        System.out.println("Representation Of Section: "+section);
        System.out.println("Generated Hash Code "+System.identityHashCode(section));
        System.out.println("Defined Hash Code : "+section.hashCode());
        System.out.println("=================================================");

        Shadow shadow= new Shadow("high ","blue","right");
        System.out.println("Representation Of Shadow: "+shadow);
        System.out.println("Generated Hash Code "+System.identityHashCode(shadow));
        System.out.println("Defined Hash Code : "+shadow.hashCode());
        System.out.println("=================================================");


        Stat stat= new Stat("Amitha ","100","5 unit");
        System.out.println("Representation Of Stat:"+stat);
        System.out.println("Generated Hash Code "+System.identityHashCode(stat));
        System.out.println("Defined Hash Code : "+stat.hashCode());
        System.out.println("=================================================");


        Status status= new Status("5678 ","watch ","msg");
        System.out.println("Representation Of Status: "+status);
        System.out.println("Generated Hash Code "+System.identityHashCode(status));
        System.out.println("Defined Hash Code : "+status.hashCode());
        System.out.println("=================================================");


        Step step= new Step("80 ","avail","yes");
        System.out.println("Representation Of Step: "+step);
        System.out.println("Generated Hash Code "+System.identityHashCode(step));
        System.out.println("Defined Hash Code : "+step.hashCode());
        System.out.println("=================================================");


        Store store= new Store("Namiths ","dvg","6");
        System.out.println("Representation Of Store: "+store);
        System.out.println("Generated Hash Code "+System.identityHashCode(store));
        System.out.println("Defined Hash Code : "+store.hashCode());
        System.out.println("=================================================");


        SubTitle subTitle= new SubTitle("english ","report","doc");
        System.out.println("Representation Of Subtitle: "+subTitle);
        System.out.println("Generated Hash Code "+System.identityHashCode(subTitle));
        System.out.println("Defined Hash Code : "+subTitle.hashCode());
        System.out.println("=================================================");


        Switch aSwitch= new Switch("KA ","Check","txt");
        System.out.println("Representation Of Switch: "+aSwitch);
        System.out.println("Generated Hash Code "+System.identityHashCode(aSwitch));
        System.out.println("Defined Hash Code : "+aSwitch.hashCode());
        System.out.println("=================================================");


        Tab tab= new Tab("Srujan ","id1","now");
        System.out.println("Representation Of Tab: "+tab);
        System.out.println("Generated Hash Code "+System.identityHashCode(tab));
        System.out.println("Defined Hash Code : "+tab.hashCode());
        System.out.println("=================================================");


        Tabbar tabbar= new Tabbar("css ","elements","right");
        System.out.println("Representation Of Tabbar: "+tabbar);
        System.out.println("Generated Hash Code "+System.identityHashCode(tabbar));
        System.out.println("Defined Hash Code : "+tabbar.hashCode());
        System.out.println("=================================================");


        Tag tag= new Tag("anchor ","blue","radio");
        System.out.println("Representation Of tag: "+tag);
        System.out.println("Generated Hash Code "+System.identityHashCode(tag));
        System.out.println("Defined Hash Code : "+tag.hashCode());
        System.out.println("=================================================");

        Task task= new Task("form ","elements","complete");
        System.out.println("Representation Of task: "+task);
        System.out.println("Generated Hash Code "+System.identityHashCode(task));
        System.out.println("Defined Hash Code : "+task.hashCode());
        System.out.println("=================================================");

        Team team= new Team("RCB ","12","rajat");
        System.out.println("Representation Of team: "+team);
        System.out.println("Generated Hash Code "+System.identityHashCode(team));
        System.out.println("Defined Hash Code : "+team.hashCode());
        System.out.println("=================================================");

        Text text= new Text("info ","italic","blue");
        System.out.println("Representation Of Text: "+text);
        System.out.println("Generated Hash Code "+System.identityHashCode(text));
        System.out.println("Defined Hash Code : "+text.hashCode());
        System.out.println("=================================================");

        TextField textField= new TextField("name ","imp","radio");
        System.out.println("Representation Of Textfield: "+textField);
        System.out.println("Generated Hash Code "+System.identityHashCode(textField));
        System.out.println("Defined Hash Code : "+textField.hashCode());
        System.out.println("=================================================");

        Theme theme= new Theme("paint ","null","red");
        System.out.println("Representation Of Theme: "+theme);
        System.out.println("Generated Hash Code "+System.identityHashCode(theme));
        System.out.println("Defined Hash Code : "+theme.hashCode());
        System.out.println("=================================================");

        Timeline timeline= new Timeline("bday ","morning","details");
        System.out.println("Representation Of Timeline: "+timeline);
        System.out.println("Generated Hash Code "+System.identityHashCode(timeline));
        System.out.println("Defined Hash Code : "+timeline.hashCode());
        System.out.println("=================================================");

        Title title= new Title("name ","mid","straight");
        System.out.println("Representation Of Title: "+title);
        System.out.println("Generated Hash Code "+System.identityHashCode(title));
        System.out.println("Defined Hash Code : "+title.hashCode());
        System.out.println("=================================================");

        Toast toast= new Toast("Not completed ","30mins","manager");
        System.out.println("Representation Of Toast: "+toast);
        System.out.println("Generated Hash Code "+System.identityHashCode(toast));
        System.out.println("Defined Hash Code : "+toast.hashCode());
        System.out.println("=================================================");

        Tool tool= new Tool("hammer ","wood","small");
        System.out.println("Representation Of tool: "+tool);
        System.out.println("Generated Hash Code "+System.identityHashCode(tool));
        System.out.println("Defined Hash Code : "+tool.hashCode());
        System.out.println("=================================================");

        ToolBar toolBar= new ToolBar("head ","top","blue");
        System.out.println("Representation Of Toolbar: "+toolBar);
        System.out.println("Generated Hash Code "+System.identityHashCode(toolBar));
        System.out.println("Defined Hash Code : "+toolBar.hashCode());
        System.out.println("=================================================");

        Upload upload= new Upload("image ","small","uploading");
        System.out.println("Representation Of upload: "+upload);
        System.out.println("Generated Hash Code "+System.identityHashCode(upload));
        System.out.println("Defined Hash Code : "+upload.hashCode());
        System.out.println("=================================================");

        User user= new User("Manager ","manager@gmail.com","developer");
        System.out.println("Representation Of user: "+user);
        System.out.println("Generated Hash Code "+System.identityHashCode(user));
        System.out.println("Defined Hash Code : "+user.hashCode());
        System.out.println("=================================================");

        Util util= new Util("name ","text","high");
        System.out.println("Representation Of Util: "+util);
        System.out.println("Generated Hash Code "+System.identityHashCode(util));
        System.out.println("Defined Hash Code : "+util.hashCode());
        System.out.println("=================================================");

        Widget widget= new Widget("cube ","txt","std");
        System.out.println("Representation Of widget: "+widget);
        System.out.println("Generated Hash Code "+System.identityHashCode(widget));
        System.out.println("Defined Hash Code : "+widget.hashCode());
        System.out.println("=================================================");

        Wrapper wrapper= new Wrapper("class ","50","100");
        System.out.println("Representation Of Wrapper: "+wrapper);
        System.out.println("Generated Hash Code "+System.identityHashCode(wrapper));
        System.out.println("Defined Hash Code : "+wrapper.hashCode());
        System.out.println("=================================================");

































    }
}