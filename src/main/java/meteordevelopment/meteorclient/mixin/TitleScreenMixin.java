.class public Lmeteordevelopment/meteorclient/mixin/TitleScreenMixin;
.super Lnet/minecraft/class_437;
.source "TitleScreenMixin.java"


# annotations
.annotation build Lorg/spongepowered/asm/mixin/Mixin;
    value = {
        Lnet/minecraft/class_442;
    }
.end annotation


# direct methods
.method public constructor <init>(Lnet/minecraft/class_2561;)V
    .registers 2

    .line 33
    invoke-direct {p0, p1}, Lnet/minecraft/class_437;-><init>(Lnet/minecraft/class_2561;)V

    .line 34
    return-void
.end method

.method private synthetic lambda$onRenderIdkDude$2()V
    .registers 1

    .line 45
    return-void
.end method

.method private onMouseClicked(DDILorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable;)V
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(DDI",
            "Lorg/spongepowered/asm/mixin/injection/callback/CallbackInfoReturnable",
            "<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Lorg/spongepowered/asm/mixin/injection/Inject;
        at = {
            .subannotation Lorg/spongepowered/asm/mixin/injection/At;
                value = "HEAD"
            .end subannotation
        }
        cancellable = true
        method = {
            "mouseClicked"
        }
    .end annotation

    .line 80
    return-void
.end method

.method private onRender(Lnet/minecraft/class_332;IIFLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V
    .registers 6
    .annotation runtime Lorg/spongepowered/asm/mixin/injection/Inject;
        at = {
            .subannotation Lorg/spongepowered/asm/mixin/injection/At;
                value = "TAIL"
            .end subannotation
        }
        method = {
            "render"
        }
    .end annotation

    .line 75
    return-void
.end method

.method private onRenderIdkDude(Lnet/minecraft/class_332;IIFLorg/spongepowered/asm/mixin/injection/callback/CallbackInfo;)V
    .registers 7
    .annotation runtime Lorg/spongepowered/asm/mixin/injection/Inject;
        at = {
            .subannotation Lorg/spongepowered/asm/mixin/injection/At;
                ordinal = 0x0
                target = "Lnet/minecraft/client/gui/DrawContext;drawTextWithShadow(Lnet/minecraft/client/font/TextRenderer;Ljava/lang/String;III)I"
                value = "INVOKE"
            .end subannotation
        }
        method = {
            "render"
        }
    .end annotation

    .line 38
    sget-boolean v0, Lmeteordevelopment/meteorclient/utils/Utils;->firstTimeTitleScreen:Z

    if-eqz v0, :cond_7

    .line 39
    const/4 v0, 0x0

    sput-boolean v0, Lmeteordevelopment/meteorclient/utils/Utils;->firstTimeTitleScreen:Z

    .line 71
    :cond_7
    return-void
.end method
