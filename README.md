# IItem Renderer
IItem Renderer API gives you ability to hook into item rendering. More specifically:
- Use GL calls during item rendering.
- Super-ultra-hyper-dynamic rendering.
- Change GUI overlay.

### How do i install it?
1. Go to [releases section](https://github.com/elix-x/IItem-Renderer/releases).
2. Download API and drop contents into your src/api/java folder.
3. Download DEV jar and drop into your run/mods folder.

### How do i use it?
IItem Renderer API has only 2 classes: [IItemRendererAPI](https://github.com/elix-x/IItem-Renderer/blob/master/src/main/java/code/elix_x/mods/iitemrenderer/api/IItemRendererAPI.java) and [IItemRenderer](https://github.com/elix-x/IItem-Renderer/blob/master/src/main/java/code/elix_x/mods/iitemrenderer/api/IItemRenderer.java).
You implement [IItemRenderer interface](https://github.com/elix-x/IItem-Renderer/blob/master/src/main/java/code/elix_x/mods/iitemrenderer/api/IItemRenderer.java) (you CAN use anonymous class), and you give an instance to [IItemRendererAPI.registerIItemRenderer()](https://github.com/elix-x/IItem-Renderer/blob/master/src/main/java/code/elix_x/mods/iitemrenderer/api/IItemRendererAPI.java#L41).
You use methods in your [IItemRenderer](https://github.com/elix-x/IItem-Renderer/blob/master/src/main/java/code/elix_x/mods/iitemrenderer/api/IItemRenderer.java) implementation to do stuff.

##### All API methods and classes have description explaining how to use them

_Demos will come in close future_
