package gacha.banner;

public enum BannerType{
        CHARACTER_EVENT{
            @Override
            public String toString(){
                return "Character Event Warp";
            }
        },
        LIGHT_CONE_EVENT{
            @Override
            public String toString(){
                return "Light Cone Event Warp";
            }
        },
        STANDARD{
            @Override
            public String toString(){
                return "Regular Warp";
            }
        },
        COLLABORATION{
            @Override
            public String toString(){
                return "Collaboration Warp";
            }
        };
}