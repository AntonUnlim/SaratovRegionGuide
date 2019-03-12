package com.example.saratovregionguide;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Data {
    public static final String INTENT_REGION = "Region";
    public static final String INTENT_IS_REGION = "IsRegion";
    public static final String INTENT_SIGHT = "Sight";
    public static String HTML_START = "<html><head>" +
            "<style type=\"text/css\">" +
            "p {text-indent: 15px; text-align: justify;}" +
            "</style></head><body>";
    public static String HTML_END = "</body></html>";

    private static ArrayList<Region> listOfRegions;

    public static void fillRegions() {
        listOfRegions = new ArrayList<>();
        ArrayList<Sight> listOfRegionalCenterSights = new ArrayList<>();
        ArrayList<Sight> listOfRegionSights = new ArrayList<>();



        /*
        // Александрово-Гайский район
        //  Список достопримечательностей районного центра
        listOfRegionalCenterSights.add(new Sight(
                "",
                "",
                "",
                ""));
        //  Список достопримечательностей района
        listOfRegionSights.add(new Sight(
                "",
                "",
                "",
                ""));
        listOfRegions.add(new Region(
                "Александрово-Гайск",
                listOfRegionalCenterSights,
                listOfRegionSights,
                "Александров Гай",
                "Александрова Гая",
                "Aleksandrovo_Gayskiy/emblem.gif",
                "",
                286));
        listOfRegionalCenterSights.clear();

        // Аркадакский район
        //  Список достопримечательностей районного центра
        listOfRegionalCenterSights.add(new Sight(
                "",
                "",
                "",
                ""));
        //  Список достопримечательностей района
        listOfRegionSights.add(new Sight(
                "",
                "",
                "",
                ""));
        listOfRegions.add(new Region(
                "Аркадакск",
                listOfRegionalCenterSights,
                listOfRegionSights,
                "Аркадак",
                "Аркадака",
                "Arkadakskiy/emblem.gif",
                "",
                240));
        listOfRegionalCenterSights.clear();

        // Аткарский район
        //  Список достопримечательностей районного центра
        listOfRegionalCenterSights.add(new Sight(
                "",
                "",
                "",
                ""));
        //  Список достопримечательностей района
        listOfRegionSights.add(new Sight(
                "",
                "",
                "",
                ""));
        listOfRegions.add(new Region(
                "Аткарск",
                listOfRegionalCenterSights,
                listOfRegionSights,
                "Аткарск",
                "Аткарска",
                "Atkarskiy/emblem.gif",
                "",
                100));
        listOfRegionalCenterSights.clear();

        // Базарно-Карабулакский район
        //  Список достопримечательностей районного центра
        listOfRegionalCenterSights.add(new Sight(
                "",
                "",
                "",
                ""));
        //  Список достопримечательностей района
        listOfRegionSights.add(new Sight(
                "",
                "",
                "",
                ""));
        listOfRegions.add(new Region(
                "Базарно-Карабулакск",
                listOfRegionalCenterSights,
                listOfRegionSights,
                "Базарный Карабулак",
                "Базарного Карабулака",
                "Bazarno_Karabulakskiy/emblem.gif",
                "",
                102));
        listOfRegionalCenterSights.clear();

        // Балаковский район
        //  Список достопримечательностей районного центра
        listOfRegionalCenterSights.add(new Sight(
                "Балаковский ТЮЗ",
                "Театр юного зрителя",
                "",
                ""));
        listOfRegionalCenterSights.add(new Sight(
                "Выставочный зал",
                "Городской выставочный зал",
                "",
                ""));
        listOfRegionalCenterSights.add(new Sight(
                "Музей истории",
                "Музей истории города",
                "",
                ""));
        listOfRegionalCenterSights.add(new Sight(
                "Художественный музей",
                "Филиал Художественного музея им. А. Н. Радищева",
                "",
                ""));
        listOfRegionalCenterSights.add(new Sight(
                "Балаковская АЭС",
                "Информационный центр Балаковской АЭС",
                "",
                ""));
        listOfRegionalCenterSights.add(new Sight(
                "Усадьба Мальцева",
                "Усадьба Паисия Мальцева",
                "",
                ""));
        listOfRegionalCenterSights.add(new Sight(
                "Дом-музей Чапаева",
                "Дом-музей Василия Ивановича Чапаева",
                "",
                ""));
        listOfRegionalCenterSights.add(new Sight(
                "Музей Боевой Славы",
                "Музей Боевой Славы центра «Набат»",
                "",
                ""));
        listOfRegionalCenterSights.add(new Sight(
                "Музей Почты",
                "Музей истории почты",
                "",
                ""));
        listOfRegionalCenterSights.add(new Sight(
                "Музей в школе 7",
                "Музей, посвященный В. Н. Перегудову в СОШ № 7",
                "",
                ""));
        //  Список достопримечательностей района
        listOfRegionSights.add(new Sight(
                "",
                "",
                "",
                ""));
        listOfRegions.add(new Region(
                "Балаковск",
                listOfRegionalCenterSights,
                listOfRegionSights,
                "Балаково",
                "Балакова",
                "Balakovskiy/emblem.gif",
                "На гербе изображена плывущая ладья с золотым снопом, символизирующим историческое значение города как большой хлебной пристани на Волге. Восходящее солнце отражает реалии нынешнего дня: наличие Саратовской ГЭС и Балаковской АЭС, дающих городу статус крупнейшего энергетического центра на Волге.",
                165));
        listOfRegionalCenterSights.clear();

        // Балашовский район
        //  Список достопримечательностей районного центра
        listOfRegionalCenterSights.add(new Sight(
                "",
                "",
                "",
                ""));
        //  Список достопримечательностей района
        listOfRegionSights.add(new Sight(
                "",
                "",
                "",
                ""));
        listOfRegions.add(new Region(
                "Балашовск",
                listOfRegionalCenterSights,
                listOfRegionSights,
                "Балашов",
                "Балашова",
                "",
                "",
                210));
        listOfRegionalCenterSights.clear();

        // Балтайский район
        //  Список достопримечательностей районного центра
        listOfRegionalCenterSights.add(new Sight(
                "",
                "",
                "",
                ""));
        //  Список достопримечательностей района
        listOfRegionSights.add(new Sight(
                "",
                "",
                "",
                ""));
        listOfRegions.add(new Region(
                "Балтайск",
                listOfRegionalCenterSights,
                listOfRegionSights,
                "Балтай",
                "Балтая",
                "Baltayskiy/emblem.gif",
                "",
                138));
        listOfRegionalCenterSights.clear();

        // Вольский район
        //  Список достопримечательностей районного центра
        listOfRegionalCenterSights.add(new Sight(
                "",
                "",
                "",
                ""));
        //  Список достопримечательностей района
        listOfRegionSights.add(new Sight(
                "",
                "",
                "",
                ""));
        listOfRegions.add(new Region(
                "Вольск",
                listOfRegionalCenterSights,
                listOfRegionSights,
                "Вольск",
                "Вольска",
                "Volskiy/emblem.gif",
                "",
                146));
        listOfRegionalCenterSights.clear();

        // Воскресенский район
        //  Список достопримечательностей районного центра
        listOfRegionalCenterSights.add(new Sight(
                "",
                "",
                "",
                ""));
        //  Список достопримечательностей района
        listOfRegionSights.add(new Sight(
                "",
                "",
                "",
                ""));
        listOfRegions.add(new Region(
                "Воскресенск",
                listOfRegionalCenterSights,
                listOfRegionSights,
                "Воскресенское",
                "Воскресенского",
                "Voskresenskiy/emblem.gif",
                "",
                112));
        listOfRegionalCenterSights.clear();

        // Дергачёвский район
        //  Список достопримечательностей районного центра
        listOfRegionalCenterSights.add(new Sight(
                "",
                "",
                "",
                ""));
        //  Список достопримечательностей района
        listOfRegionSights.add(new Sight(
                "",
                "",
                "",
                ""));
        listOfRegions.add(new Region(
                "Дергачёвск",
                listOfRegionalCenterSights,
                listOfRegionSights,
                "Дергачи",
                "Дергачей",
                "Dergachevskiy/emblem.gif",
                "",
                222));
        listOfRegionalCenterSights.clear();

        // Духовницкий район
        //  Список достопримечательностей районного центра
        listOfRegionalCenterSights.add(new Sight(
                "",
                "",
                "",
                ""));
        //  Список достопримечательностей района
        listOfRegionSights.add(new Sight(
                "",
                "",
                "",
                ""));
        listOfRegions.add(new Region(
                "Духовницк",
                listOfRegionalCenterSights,
                listOfRegionSights,
                "Духовницкое",
                "Духовницкого",
                "Dukhovnitskiy/emblem.gif",
                "",
                253));
        listOfRegionalCenterSights.clear();

        // Екатериновский район
        //  Список достопримечательностей районного центра
        listOfRegionalCenterSights.add(new Sight(
                "",
                "",
                "",
                ""));
        //  Список достопримечательностей района
        listOfRegionSights.add(new Sight(
                "",
                "",
                "",
                ""));
        listOfRegions.add(new Region(
                "Екатериновск",
                listOfRegionalCenterSights,
                listOfRegionSights,
                "Екатериновка",
                "Екатериновки",
                "Ekaterinovskiy/emblem.gif",
                "",
                148));
        listOfRegionalCenterSights.clear();

        // Ершовский район
        //  Список достопримечательностей районного центра
        listOfRegionalCenterSights.add(new Sight(
                "",
                "",
                "",
                ""));
        //  Список достопримечательностей района
        listOfRegionSights.add(new Sight(
                "",
                "",
                "",
                ""));
        listOfRegions.add(new Region(
                "Ершовск",
                listOfRegionalCenterSights,
                listOfRegionSights,
                "Ершов",
                "Ершова",
                "Ershovskiy/emblem.gif",
                "",
                178));
        listOfRegionalCenterSights.clear();

        // Ивантеевский район
        //  Список достопримечательностей районного центра
        listOfRegionalCenterSights.add(new Sight(
                "",
                "",
                "",
                ""));
        //  Список достопримечательностей района
        listOfRegionSights.add(new Sight(
                "",
                "",
                "",
                ""));
        listOfRegions.add(new Region(
                "Ивантеевск",
                listOfRegionalCenterSights,
                listOfRegionSights,
                "Ивантеевка",
                "Ивантеевки",
                "Ivanteevskiy/emblem.gif",
                "",
                270));
        listOfRegionalCenterSights.clear();

        // Калининский район
        //  Список достопримечательностей районного центра
        listOfRegionalCenterSights.add(new Sight(
                "",
                "",
                "",
                ""));
        //  Список достопримечательностей района
        listOfRegionSights.add(new Sight(
                "",
                "",
                "",
                ""));
        listOfRegions.add(new Region(
                "Калининск",
                listOfRegionalCenterSights,
                listOfRegionSights,
                "Калининск",
                "Калининска",
                "Kalininskiy/emblem.gif",
                "",
                118));
        listOfRegionalCenterSights.clear();

        // Красноармейский район
        //  Список достопримечательностей районного центра
        listOfRegionalCenterSights.add(new Sight(
                "",
                "",
                "",
                ""));
        //  Список достопримечательностей района
        listOfRegionSights.add(new Sight(
                "",
                "",
                "",
                ""));
        listOfRegions.add(new Region(
                "Красноармейск",
                listOfRegionalCenterSights,
                listOfRegionSights,
                "Красноармейск",
                "Красноармейска",
                "Krasnoarmeyskiy/emblem.gif",
                "",
                82));
        listOfRegionalCenterSights.clear();

        // Краснокутский район
        //  Список достопримечательностей районного центра
        listOfRegionalCenterSights.add(new Sight(
                "",
                "",
                "",
                ""));
        //  Список достопримечательностей района
        listOfRegionSights.add(new Sight(
                "",
                "",
                "",
                ""));
        listOfRegions.add(new Region(
                "Краснокутск",
                listOfRegionalCenterSights,
                listOfRegionSights,
                "Красный Кут",
                "Красного Кута",
                "Krasnokutskiy/emblem.gif",
                "",
                123));
        listOfRegionalCenterSights.clear();

        // Краснопартизанский район
        //  Список достопримечательностей районного центра
        listOfRegionalCenterSights.add(new Sight(
                "",
                "",
                "",
                ""));
        //  Список достопримечательностей района
        listOfRegionSights.add(new Sight(
                "",
                "",
                "",
                ""));
        listOfRegions.add(new Region(
                "Краснопартизанск",
                listOfRegionalCenterSights,
                listOfRegionSights,
                "Горный",
                "Горного",
                "Krasnopartizanskiy/emblem.gif",
                "",
                225));
        listOfRegionalCenterSights.clear();

        // Лысогорский район
        //  Список достопримечательностей районного центра
        listOfRegionalCenterSights.add(new Sight(
                "",
                "",
                "",
                ""));
        //  Список достопримечательностей района
        listOfRegionSights.add(new Sight(
                "",
                "",
                "",
                ""));
        listOfRegions.add(new Region(
                "Лысогорск",
                listOfRegionalCenterSights,
                listOfRegionSights,
                "Лысые Горы",
                "Лысых Гор",
                "Lysogorskiy/emblem.gif",
                "",
                95));
        listOfRegionalCenterSights.clear();

        // Марксовский район
        //  Список достопримечательностей районного центра
        listOfRegionalCenterSights.add(new Sight(
                "",
                "",
                "",
                ""));
        //  Список достопримечательностей района
        listOfRegionSights.add(new Sight(
                "",
                "",
                "",
                ""));
        listOfRegions.add(new Region(
                "Марксовск",
                listOfRegionalCenterSights,
                listOfRegionSights,
                "Маркс",
                "Маркса",
                "Marksovskiy/emblem.gif",
                "",
                61));
        listOfRegionalCenterSights.clear();

        // Новобурасский район
        //  Список достопримечательностей районного центра
        listOfRegionalCenterSights.add(new Sight(
                "",
                "",
                "",
                ""));
        //  Список достопримечательностей района
        listOfRegionSights.add(new Sight(
                "",
                "",
                "",
                ""));
        listOfRegions.add(new Region(
                "Новобурасск",
                listOfRegionalCenterSights,
                listOfRegionSights,
                "Новые Бурасы",
                "Новых Бурас",
                "Novoburasskiy/emblem.gif",
                "",
                76));
        listOfRegionalCenterSights.clear();

        // Новоузенский район
        //  Список достопримечательностей районного центра
        listOfRegionalCenterSights.add(new Sight(
                "",
                "",
                "",
                ""));
        //  Список достопримечательностей района
        listOfRegionSights.add(new Sight(
                "",
                "",
                "",
                ""));
        listOfRegions.add(new Region(
                "Новоузенск",
                listOfRegionalCenterSights,
                listOfRegionSights,
                "Новоузенск",
                "Новоузенска",
                "Novouzenskiy/emblem.gif",
                "",
                212));
        listOfRegionalCenterSights.clear();

        // Озинский район
        //  Список достопримечательностей районного центра
        listOfRegionalCenterSights.add(new Sight(
                "",
                "",
                "",
                ""));
        //  Список достопримечательностей района
        listOfRegionSights.add(new Sight(
                "",
                "",
                "",
                ""));
        listOfRegions.add(new Region(
                "Озинск",
                listOfRegionalCenterSights,
                listOfRegionSights,
                "Озинки",
                "Озинок",
                "Ozinskiy/emblem.gif",
                "",
                293));
        listOfRegionalCenterSights.clear();

        // Перелюбский район
        //  Список достопримечательностей районного центра
        listOfRegionalCenterSights.add(new Sight(
                "",
                "",
                "",
                ""));
        //  Список достопримечательностей района
        listOfRegionSights.add(new Sight(
                "",
                "",
                "",
                ""));
        listOfRegions.add(new Region(
                "Перелюбск",
                listOfRegionalCenterSights,
                listOfRegionSights,
                "Перелюб",
                "Перелюба",
                "Perelyubskiy/emblem.gif",
                "",
                343));
        listOfRegionalCenterSights.clear();

        // Петровский район
        //  Список достопримечательностей районного центра
        listOfRegionalCenterSights.add(new Sight(
                "",
                "",
                "",
                ""));
        //  Список достопримечательностей района
        listOfRegionSights.add(new Sight(
                "",
                "",
                "",
                ""));
        listOfRegions.add(new Region(
                "Петровск",
                listOfRegionalCenterSights,
                listOfRegionSights,
                "Петровск",
                "Петровска",
                "Petrovskiy/emblem.gif",
                "",
                112));
        listOfRegionalCenterSights.clear();

        // Питерский район
        //  Список достопримечательностей районного центра
        listOfRegionalCenterSights.add(new Sight(
                "",
                "",
                "",
                ""));
        //  Список достопримечательностей района
        listOfRegionSights.add(new Sight(
                "",
                "",
                "",
                ""));
        listOfRegions.add(new Region(
                "Питерск",
                listOfRegionalCenterSights,
                listOfRegionSights,
                "Питерка",
                "Питерки",
                "Piterskiy/emblem.gif",
                "",
                169));
        listOfRegionalCenterSights.clear();

        // Пугачёвский район
        //  Список достопримечательностей районного центра
        listOfRegionalCenterSights.add(new Sight(
                "",
                "",
                "",
                ""));
        //  Список достопримечательностей района
        listOfRegionSights.add(new Sight(
                "",
                "",
                "",
                ""));
        listOfRegions.add(new Region(
                "Пугачёвск",
                listOfRegionalCenterSights,
                listOfRegionSights,
                "Пугачёв",
                "Пугачёва",
                "Pugachevskiy/emblem.gif",
                "",
                229));
        listOfRegionalCenterSights.clear();

        // Ровенский район
        //  Список достопримечательностей районного центра
        listOfRegionalCenterSights.add(new Sight(
                "",
                "",
                "",
                ""));
        //  Список достопримечательностей района
        listOfRegionSights.add(new Sight(
                "",
                "",
                "",
                ""));
        listOfRegions.add(new Region(
                "Ровенск",
                listOfRegionalCenterSights,
                listOfRegionSights,
                "Ровное",
                "Ровного",
                "Rovenskiy/emblem.jpg",
                "",
                103));
        listOfRegionalCenterSights.clear();

        // Романовский район
        //  Список достопримечательностей районного центра
        listOfRegionalCenterSights.add(new Sight(
                "",
                "",
                "",
                ""));
        //  Список достопримечательностей района
        listOfRegionSights.add(new Sight(
                "",
                "",
                "",
                ""));
        listOfRegions.add(new Region(
                "Романовск",
                listOfRegionalCenterSights,
                listOfRegionSights,
                "Романовка",
                "Романовки",
                "Romanovskiy/emblem.gif",
                "",
                253));
        listOfRegionalCenterSights.clear();

        // Ртищевский район
        //  Список достопримечательностей районного центра
        listOfRegionalCenterSights.add(new Sight(
                "",
                "",
                "",
                ""));
        //  Список достопримечательностей района
        listOfRegionSights.add(new Sight(
                "",
                "",
                "",
                ""));
        listOfRegions.add(new Region(
                "Ртищевск",
                listOfRegionalCenterSights,
                listOfRegionSights,
                "Ртищево",
                "Ртищева",
                "Rtischevskiy/emblem.gif",
                "",
                205));
        listOfRegionalCenterSights.clear();

        // Самойловский район
        //  Список достопримечательностей районного центра
        listOfRegionalCenterSights.add(new Sight(
                "",
                "",
                "",
                ""));
        //  Список достопримечательностей района
        listOfRegionSights.add(new Sight(
                "",
                "",
                "",
                ""));
        listOfRegions.add(new Region(
                "Самойловск",
                listOfRegionalCenterSights,
                listOfRegionSights,
                "Самойловка",
                "Самойловки",
                "Samoylovskiy/emblem.gif",
                "",
                196));
        listOfRegionalCenterSights.clear();

         // Саратов
        listOfRegionalCenterSights.add(new Sight(
                "",
                "",
                "",
                ""
        ));
        listOfRegions.add(new Region("Саратов", listOfRegionalCenterSights));
        listOfRegionalCenterSights.clear();

        // Саратовский район
        listOfRegionalCenterSights.add(new Sight(
                "",
                "",
                "",
                ""
        ));
        listOfRegions.add(new Region("Саратовск", listOfRegionalCenterSights));
        listOfRegionalCenterSights.clear();

        // Советский район
        //  Список достопримечательностей районного центра
        listOfRegionalCenterSights.add(new Sight(
                "",
                "",
                "",
                ""));
        //  Список достопримечательностей района
        listOfRegionSights.add(new Sight(
                "",
                "",
                "",
                ""));
        listOfRegions.add(new Region(
                "Советск",
                listOfRegionalCenterSights,
                listOfRegionSights,
                "Степное",
                "Степного",
                "Sovetskiy/emblem.gif",
                "",
                80));
        listOfRegionalCenterSights.clear();

        // Татищевский район
        //  Список достопримечательностей районного центра
        listOfRegionalCenterSights.add(new Sight(
                "",
                "",
                "",
                ""));
        //  Список достопримечательностей района
        listOfRegionSights.add(new Sight(
                "",
                "",
                "",
                ""));
        listOfRegions.add(new Region(
                "Татищевск",
                listOfRegionalCenterSights,
                listOfRegionSights,
                "Татищево",
                "Татищева",
                "Tatischevskiy/emblem.gif",
                "",
                46));
        listOfRegionalCenterSights.clear();

        // Турковский район
        //  Список достопримечательностей районного центра
        listOfRegionalCenterSights.add(new Sight(
                "",
                "",
                "",
                ""));
        //  Список достопримечательностей района
        listOfRegionSights.add(new Sight(
                "",
                "",
                "",
                ""));
        listOfRegions.add(new Region(
                "Турковск",
                listOfRegionalCenterSights,
                listOfRegionSights,
                "Турки",
                "Турок",
                "Turkovskiy/emblem.gif",
                "",
                266));
        listOfRegionalCenterSights.clear();

        // Фёдоровский район
        //  Список достопримечательностей районного центра
        listOfRegionalCenterSights.add(new Sight(
                "",
                "",
                "",
                ""));
        //  Список достопримечательностей района
        listOfRegionSights.add(new Sight(
                "",
                "",
                "",
                ""));
        listOfRegions.add(new Region(
                "Фёдоровск",
                listOfRegionalCenterSights,
                listOfRegionSights,
                "Мокроус",
                "Мокроуса",
                "Fedorovskiy/emblem.gif",
                "",
                120));
        listOfRegionalCenterSights.clear();

        // Хвалынский район
        //  Список достопримечательностей районного центра
        listOfRegionalCenterSights.add(new Sight(
                "",
                "",
                "",
                ""));
        //  Список достопримечательностей района
        listOfRegionSights.add(new Sight(
                "",
                "",
                "",
                ""));
        listOfRegions.add(new Region(
                "Хвалынск",
                listOfRegionalCenterSights,
                listOfRegionSights,
                "Хвалынск",
                "Хвалынск",
                "KHvalynskiy/emblem.gif",
                "",
                230));
        listOfRegionalCenterSights.clear();

        // Энгельсский район
        //  Список достопримечательностей районного центра
        listOfRegionalCenterSights.add(new Sight(
                "",
                "",
                "",
                ""));
        //  Список достопримечательностей района
        listOfRegionSights.add(new Sight(
                "",
                "",
                "",
                ""));
        listOfRegions.add(new Region(
                "Энгельсск",
                listOfRegionalCenterSights,
                listOfRegionSights,
                "Энгельс",
                "Энгельса",
                "Engelsskiy/emblem.jpg",
                "",
                9));
        listOfRegionalCenterSights.clear();*/
    }

    public static ArrayList<Region> getListOfRegions() {
        return listOfRegions;
    }

    public static TextView getStyledTextView(Context context, String text){
        TextView textView = new TextView(context, null, 0, R.style.TextViewButtonStyle);
        textView.setText(text);

        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        layoutParams.setMargins(10, 10, 10, 10);
        textView.setLayoutParams(layoutParams);

        return textView;
    }
}