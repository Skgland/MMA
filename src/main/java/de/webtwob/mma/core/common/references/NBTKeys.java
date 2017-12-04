package de.webtwob.mma.core.common.references;

import static de.webtwob.mma.core.MMACore.MODID;

/**
 * Created by BB20101997 on 16. Mär. 2017.
 */
@SuppressWarnings("StringConcatenationMissingWhitespace")
public class NBTKeys {

    public static final String QS_ITEM_HANDLER = MODID + ":QSITEMS";
    public static final String QS_TOKEN = MODID + ":QSToken";
    public static final String QS_STATE = MODID + ":QSState";
    public static final String QS_DATA = MODID + "qsData";
    public static final String QS_COLLECT_LENGTH = MODID + ":qsCollectLength";
    public static final String QS_COLLECT_LIST = MODID + ":qsCollectList";

    public static final String TOKEN_GENERATOR_MUSTER = MODID + ":TokenGeneratorMuster";
    public static final String TOKEN_GENERATOR_COMBINED = MODID + ":TokenGeneratorCombined";

    public static final String RB_PAGES = MODID + ":page";
    public static final String RB_PAGE_NAME = MODID + ":pageName";
    public static final String RB_PAGE_LINK = MODID + ":pageLink";
    public static final String RB_PAGE_RECIPE = MODID + ":pageRecipe";

    public static final String CRAFTING_STORAGE_LIST = MODID + ":cslist";
    public static final String QUEUE_STACKS = MODID+":queueStacks";
    public static final String CRAFTING_CONTROLLER_QUEUE_LINKS = MODID + ":queueLinks";
    
    private NBTKeys() {
    }
}
